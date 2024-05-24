package com.simas.controller.guest;

import com.simas.domain.dto.UserInfoDTO;
import com.simas.domain.resp.Result;
import com.simas.domain.vo.UserVO;
import com.simas.service.IUserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 *  用户控制器
 * </p>
 *
 * @author yzc
 * @since 2024-05-20
 */
@RestController
@RequestMapping("/user")
@Tag(name = "用户相关")
@RequiredArgsConstructor
public class UserController {

    private final IUserService userService;

    /**
     * 获取指定用户信息
     * @param id
     * @return
     */
    @GetMapping("/info/{id}")
    @Operation(summary = "获取指定用户信息", description = "获取指定用户信息")
    public Result<UserVO> getById(@Parameter(description = "用户id") @PathVariable Long id) {
        return userService.info(id);
    }

    /**
     * 获取当前登录用户信息
     * @return
     */
    @GetMapping("/me")
    @Operation(summary = "获取当前登录用户信息", description = "获取当前登录用户信息")
    public Result<UserVO> me() {
        return userService.me();
    }

    @PostMapping
    @Operation(summary = "修改用户信息", description = "修改用户信息")
    public Result update(@RequestBody UserInfoDTO userInfoDTO) {
        return userService.updateUser(userInfoDTO);
    }

    @PostMapping("/logout")
    @Operation(summary = "退出登录", description = "具体方式不限，无需参数")
    public Result logout() {
        // TODO 退出登录,提供文档使用
        return Result.success();
    }

    @DeleteMapping
    @Operation(summary = "注销用户", description = "注销该用户自己的账号")
    public Result delete() {
        return userService.deleteMe();
    }
}
