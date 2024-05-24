package com.simas.controller.admin;

import com.simas.domain.resp.Result;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin/post")
@Tag(name = "帖子管理", description = "帖子管理")
public class PostManageController {
    @DeleteMapping("/{id}")
    @Operation(summary = "删除指定帖子", description = "删除指定帖子，必须是管理员")
    public Result deletePost(@Parameter(description = "帖子id") @PathVariable("id") Long id) {
        return null;
    }

    @DeleteMapping("/comment/{id}")
    @Operation(summary = "删除指定评论", description = "删除指定评论，必须是管理员")
    public Result deleteComment(@Parameter(description = "评论id") @PathVariable("id") Long id) {
        return null;
    }

    @PostMapping("/top/{id}")
    @Operation(summary = "置顶指定帖子", description = "置顶指定帖子，必须是管理员")
    public Result topPost(@Parameter(description = "帖子id") @PathVariable("id") Long id) {
        return null;
    }

    @PostMapping("/ban/{id}")
    @Operation(summary = "下架帖子", description = "下架帖子，必须是管理员")
    public Result banPost(@Parameter(description = "帖子id") @PathVariable("id") Long id) {
        return null;
    }
}
