package com.simas.service.impl;

import cn.hutool.core.bean.BeanUtil;
import com.simas.config.security.UserDetail;
import com.simas.domain.dto.UserInfoDTO;
import com.simas.domain.po.User;
import com.simas.domain.resp.Result;
import com.simas.domain.vo.UserVO;
import com.simas.mapper.UserMapper;
import com.simas.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  用户服务实现类， 用于更新维护用户的信息
 * </p>
 *
 * @author yzc
 * @since 2024-05-20
 */
@Service
@RequiredArgsConstructor
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

    private Long getUserId() {
        UserDetail principal = (UserDetail) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        return principal.getUserId();
    }

    /**
     * 根据id查询用户信息
     * @param id
     * @return
     */
    @Override
    public Result<UserVO> info(Long id) {
        User user = getById(id);
        UserVO userVO = BeanUtil.copyProperties(user, UserVO.class);
        return Result.success(userVO);
    }

    /**
     * 获取当前用户信息
     * @return
     */
    @Override
    public Result<UserVO> me() {
        Long userId = getUserId();
        User user = getById(userId);
        UserVO userVO = BeanUtil.copyProperties(user, UserVO.class);
        return Result.success(userVO);
    }

    /**
     * 更新用户信息
     * @param userInfoDTO
     * @return
     */
    @Override
    public Result updateUser(UserInfoDTO userInfoDTO) {
        Long userId = getUserId();
        User user = getById(userId);
        BeanUtil.copyProperties(userInfoDTO, user);
        if (userInfoDTO.getNickname() != null) {
            user.setNickname(userInfoDTO.getNickname());
        }
        if (userInfoDTO.getEmail() != null) {
            user.setEmail(userInfoDTO.getEmail());
        }
        if (userInfoDTO.getImage() != null) {
            user.setImage(userInfoDTO.getImage());
        }
        if (userInfoDTO.getGender() != null) {
            user.setGender(userInfoDTO.getGender());
        }
        if (userInfoDTO.getProvince() != null) {
            user.setProvince(userInfoDTO.getProvince());
        }
        if (userInfoDTO.getCity() != null) {
            user.setCity(userInfoDTO.getCity());
        }
        if (userInfoDTO.getCountry() != null) {
            user.setCountry(userInfoDTO.getCountry());
        }
        updateById(user);
        return Result.success();
    }

    @Override
    public Result deleteMe() {
        Long userId = getUserId();
        removeById(userId);
        // TODO 删除用户时，需要删除用户的所有信息，包括评论、点赞、收藏等
        // TODO 清楚Redis信息
        return Result.success();
    }
}
