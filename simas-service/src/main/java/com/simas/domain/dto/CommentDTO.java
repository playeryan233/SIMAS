package com.simas.domain.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.io.Serializable;

@Data
@Schema(description = "评论信息")
public class CommentDTO implements Serializable {

    @Schema(description = "帖子ID", requiredMode = Schema.RequiredMode.REQUIRED)
    private Long postId;
    @Schema(description = "评论内容", requiredMode = Schema.RequiredMode.REQUIRED)
    private String content;
}
