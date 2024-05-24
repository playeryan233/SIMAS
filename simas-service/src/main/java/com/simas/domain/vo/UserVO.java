package com.simas.domain.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Schema(description = "用户信息")
public class UserVO implements Serializable {
    @Schema(description = "用户名（即账户）")
    private String username;
    @Schema(description = "昵称")
    private String nickname;
    @Schema(description = "邮箱")
    private String email;
    @Schema(description = "头像")
    private String image;
    @Schema(description = "粉丝数量")
    private Integer followers;
    @Schema(description = "关注数量")
    private Integer subscribe;
    @Schema(description = "浏览量数量")
    private Integer views;
    // 1 男 2 女
    @Schema(description = "性别 1 男 2 女")
    private Integer gender;
    @Schema(description = "省份")
    private String province;
    @Schema(description = "城市")
    private String city;
    @Schema(description = "国家")
    private String country;
    @Schema(description = "创建时间")
    private LocalDateTime lastLoginDate;
    @Schema(description = "是否在线")
    private Boolean online;
}
