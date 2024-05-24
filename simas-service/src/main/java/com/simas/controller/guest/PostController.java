package com.simas.controller.guest;


import com.simas.domain.dto.CommentDTO;
import com.simas.domain.dto.PostDTO;
import com.simas.domain.resp.Result;
import com.simas.domain.vo.PostVO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 *  帖子控制器
 * </p>
 *
 * @author yzc
 * @since 2024-05-22
 */
@RestController
@RequestMapping("/post")
@Tag(name = "帖子相关")
public class PostController {

    // TODO

    @PostMapping("/publish")
    @Operation(summary = "发布帖子", description = "发布帖子")
    public Result publishPost(@RequestBody PostDTO postDTO){
        return null;
    }

    @PostMapping("/comment")
    @Operation(summary = "评论帖子", description = "评论帖子")
    public Result commentPost(@RequestBody CommentDTO commentDTO){
        return null;
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "删除帖子", description = "删除帖子")
    public Result deletePost(@Parameter(description = "帖子id") @PathVariable Long postId){
        return null;
    }

    @GetMapping("/search/{keyword}")
    @Operation(summary = "搜索帖子", description = "根据关键词搜索帖子")
    public Result<PostVO> searchPost(@Parameter(description = "关键词") @PathVariable String keyword){
        return null;
    }

}
