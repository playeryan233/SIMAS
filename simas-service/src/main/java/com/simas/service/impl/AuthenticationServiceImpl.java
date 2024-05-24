package com.simas.service.impl;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.util.StrUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.simas.UserConstants;
import com.simas.config.security.UserDetail;
import com.simas.domain.dto.UserLoginDTO;
import com.simas.domain.dto.UserRegisterDTO;
import com.simas.domain.po.User;
import com.simas.domain.resp.Result;
import com.simas.service.AuthenticationService;
import com.simas.service.IUserService;
import com.simas.util.JWTUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class AuthenticationServiceImpl implements AuthenticationService {

    private final IUserService userService;
    private final PasswordEncoder passwordEncoder;
    private final JWTUtil jwtUtil;
    private final AuthenticationManager authenticationManager;

    /**
     * 注册
     * @param userRegisterDTO
     * @return
     */
    @Override
    public Result<String> register(UserRegisterDTO userRegisterDTO) {
        if (StrUtil.isBlank(userRegisterDTO.getUsername()) || userRegisterDTO.getUsername().length() > 12) {
            return Result.error("用户名长度必须在1-12之间");
        }
        if (StrUtil.isBlank(userRegisterDTO.getPassword()) ||
                userRegisterDTO.getPassword().length() < 6 ||
                userRegisterDTO.getPassword().length() > 16) {
            return Result.error("密码长度必须在6-16之间");
        }
        if (StrUtil.isBlank(userRegisterDTO.getNickname()) || userRegisterDTO.getNickname().length() > 12) {
            return Result.error("昵称长度必须在1-12之间");
        }
        // TODO 填入默认信息
        LambdaQueryWrapper<User> queryWrapper = new LambdaQueryWrapper<User>()
                .eq(User::getUsername, userRegisterDTO.getUsername());
        User user1 = userService.getOne(queryWrapper);
        if (user1 != null) {
            return Result.error("用户名已存在");
        }
        UserDetail userDetail = BeanUtil.copyProperties(userRegisterDTO, UserDetail.class);
        String encode = passwordEncoder.encode(userRegisterDTO.getPassword());
        userDetail.setPassword(encode);
        userRegisterDTO.setPassword(encode);
        User user = BeanUtil.copyProperties(userRegisterDTO, User.class);
        user.setRole(UserConstants.ROLE_ADMIN);
        user.setStatus(UserConstants.STATUS_NORMAL);
        user.setOnline(UserConstants.OFFLINE);
        user.setCreateTime(LocalDateTime.now());
        userService.save(user);
        String token = jwtUtil.generateToken(userDetail);
        // TODO 可以存入Redis
        return Result.success(token);
    }

    /**
     * 登录
     * @param userLoginDTO
     * @return
     */
    @Override
    public Result<String> authenticate(UserLoginDTO userLoginDTO) {
        // 通过Spring Security 认证管理器进行认证
        // 如果认证失败会抛出异常 eg:BadCredentialsException 密码错误 UsernameNotFoundException 用户不存在
        authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        userLoginDTO.getUsername(),
                        userLoginDTO.getPassword()
                )
        );
        // 查询用户信息
        UserDetail userDetail = BeanUtil.copyProperties(userLoginDTO, UserDetail.class);
        //通过JWT方法生成Token
        String token = jwtUtil.generateToken(userDetail);
        // TODO 可以存入Redis
        //封装响应体
        return Result.success(token);
    }
}
