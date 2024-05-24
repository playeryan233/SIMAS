package com.simas.domain.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@Schema(description = "用户信息")
public class UserInfoDTO implements Serializable {
    @Schema(description = "昵称", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    private String nickname;
    @Schema(description = "邮箱", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    private String email;
    @Schema(description = "头像，以URL形式给出", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    private String image;
    // 1 男 2 女
    @Schema(description = "性别，1 男 2 女", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    private Integer gender;
    @Schema(description = "省份", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    private String province;
    @Schema(description = "城市", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    private String city;
    @Schema(description = "国家", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    private String country;
}
