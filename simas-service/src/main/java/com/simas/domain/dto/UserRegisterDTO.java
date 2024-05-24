package com.simas.domain.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.io.Serializable;

@Data
@Schema(description = "用户注册信息")
public class UserRegisterDTO implements Serializable {
    @Schema(description = "用户名（即账号）", requiredMode = Schema.RequiredMode.REQUIRED)
    private String username;
    @Schema(description = "密码", requiredMode = Schema.RequiredMode.REQUIRED)
    private String password;
    @Schema(description = "昵称，不填会提供默认实现", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    private String nickname;
}
