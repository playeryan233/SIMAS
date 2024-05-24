package com.simas.controller;


import com.simas.domain.dto.UserLoginDTO;
import com.simas.domain.dto.UserRegisterDTO;
import com.simas.domain.resp.Result;
import com.simas.service.AuthenticationService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
@Tag(name = "用户认证")
@RequiredArgsConstructor
public class AuthenticationController {

    private final AuthenticationService authenticationService;

    /**
     * 用户注册
     */
    @PostMapping("/register")
    @Operation(summary = "用户注册", description = "用户注册")
    public Result<String> register(@RequestBody UserRegisterDTO userRegisterDTO) {
        return authenticationService.register(userRegisterDTO);
    }

    @PostMapping("/login")
    @Operation(summary = "用户登录", description = "登陆之后，请求头必须携带token进行访问")
    public Result<String> authenticate(@RequestBody UserLoginDTO userLoginDTO) {
        return authenticationService.authenticate(userLoginDTO);
    }
}
