package com.simas.controller;


import com.simas.domain.dto.UserDTO;
import com.simas.domain.po.User;
import com.simas.domain.resp.Result;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author yzc
 * @since 2024-05-20
 */
@RestController
@RequestMapping("/user")
@Tag(name = "用户管理")
public class UserController {

    @GetMapping("/test")
    @Operation(summary = "测试sum", description = "测试des")
    public Result<UserDTO> test(){
        UserDTO userDTO = UserDTO.builder()
                .username("yzc")
                .password("123456")
                .build();
        return Result.success(userDTO);
    }
}
