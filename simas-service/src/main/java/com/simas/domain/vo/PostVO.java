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
@Schema(description = "帖子信息")
public class PostVO {
    @Schema(description = "帖子id")
    private Long id;
    @Schema(description = "帖子标题")
    private String title;
    @Schema(description = "帖子作者")
    private String author;
    @Schema(description = "帖子简要内容，可做详细内容")
    private String brief;
    @Schema(description = "帖子浏览量")
    private Integer viewCount;
    @Schema(description = "帖子发表时间")
    private LocalDateTime createTime;
    @Schema(description = "帖子评论数量")
    private Integer commentCount;
    @Schema(description = "帖子点赞数量")
    private Integer like;

    // 后期需要分离
    @Schema(description = "帖子评论")
    private List<PostCommentVO> comments;
}
