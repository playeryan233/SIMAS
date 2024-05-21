package com.simas.domain.po;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;

import java.io.Serial;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author yzc
 * @since 2024-05-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("user")
public class User implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @TableField("username")
    private String username;

    @TableField("password")
    private String password;

    @TableField("nickname")
    private String nickname;

    @TableField("email")
    private String email;

    @TableField("role")
    private Integer role;

    @TableField("image")
    private String image;

    @TableField("followers")
    private Integer followers;

    @TableField("subscribe")
    private Integer subscribe;

    @TableField("views")
    private Integer views;

    @TableField("gender")
    private Integer gender;

    @TableField("province")
    private String province;

    @TableField("city")
    private String city;

    @TableField("country")
    private String country;

    @TableField("status")
    private Integer status;

    @TableField("last_login_date")
    private LocalDateTime lastLoginDate;

    @TableField("online")
    private Boolean online;

    @TableField("create_time")
    private LocalDateTime createTime;

    @TableField("update_time")
    private LocalDateTime updateTime;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;


}
