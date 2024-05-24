package com.simas.controller.guest;

import com.simas.domain.resp.Result;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/like")
@Tag(name = "点赞", description = "点赞相关接口")
public class LikeController {
    // TODO

    @PostMapping("/post/{id}")
    @Operation(summary = "点赞帖子", description = "点赞某个帖子")
    public Result likePost(@Parameter(description = "帖子id") @PathVariable("id") Long id) {
        return null;
    }

    @PostMapping("/cancel/post/{id}")
    @Operation(summary = "取消点赞帖子", description = "取消点赞某个帖子")
    public Result cancelLikePost(@Parameter(description = "帖子id") @PathVariable("id") Long id) {
        return null;
    }

    @PostMapping("/comment/{id}")
    @Operation(summary = "点赞评论", description = "点赞某个评论")
    public Result likeComment(@Parameter(description = "评论id") @PathVariable("id") Long id) {
        return null;
    }

    @PostMapping("/cancel/comment/{id}")
    @Operation(summary = "取消点赞评论", description = "取消点赞某个评论")
    public Result cancelLikeComment(@Parameter(description = "评论id") @PathVariable("id") Long id) {
        return null;
    }

}
