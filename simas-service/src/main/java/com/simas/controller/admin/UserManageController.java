package com.simas.controller.admin;

import com.simas.domain.resp.Result;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin/user")
@Tag(name = "用户管理", description = "用户管理相关接口")
public class UserManageController {

    @DeleteMapping("/{id}")
    @Operation(summary = "删除用户", description = "删除用户，必须具有管理员权限")
    public Result delete(@Parameter(description = "用户id") @PathVariable Long id) {
        return null;
    }

    @PostMapping("/ban/{id}")
    @Operation(summary = "封禁用户", description = "封禁用户，必须具有管理员权限")
    public Result ban(@Parameter(description = "用户id") @PathVariable Long id) {
        return null;
    }

    @PostMapping("/unban/{id}")
    @Operation(summary = "解封用户", description = "解封用户，必须具有管理员权限")
    public Result unban(@Parameter(description = "用户id") @PathVariable Long id) {
        return null;
    }

    @PostMapping("/shutdown/{id}")
    @Operation(summary = "禁言用户", description = "禁言用户，必须具有管理员权限")
    public Result shutdown(@Parameter(description = "用户id") @PathVariable Long id) {
        return null;
    }
}
