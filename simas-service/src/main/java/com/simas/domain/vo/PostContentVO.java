package com.simas.domain.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Schema(description = "帖子详细内容")
public class PostContentVO {
    @Schema(description = "帖子id")
    private Long id;
    @Schema(description = "帖子标题")
    private String title;
    @Schema(description = "帖子作者")
    private String author;
    @Schema(description = "帖子内容")
    private String content;
    @Schema(description = "帖子浏览量")
    private Integer viewCount;
    @Schema(description = "帖子发表时间")
    private LocalDateTime createTime;
    @Schema(description = "帖子评论数量")
    private Integer commentCount;
    @Schema(description = "帖子点赞数量")
    private Integer like;
    @Schema(description = "帖子评论")
    private List<PostCommentVO> comments;

}
