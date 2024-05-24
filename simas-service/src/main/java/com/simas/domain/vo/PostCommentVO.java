package com.simas.domain.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Schema(description = "帖子评论")
public class PostCommentVO {
    @Schema(description = "评论id")
    private Long id;
    @Schema(description = "评论人昵称")
    private String nickname;
    @Schema(description = "评论内容")
    private String content;
    @Schema(description = "评论点赞数")
    private Integer like;
    @Schema(description = "评论时间")
    private LocalDateTime createTime;
}
