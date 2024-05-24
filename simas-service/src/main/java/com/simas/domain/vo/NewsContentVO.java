package com.simas.domain.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Schema(description = "新闻详细内容")
public class NewsContentVO {
    @Schema(description = "资讯ID")
    private Long id;
    @Schema(description = "资讯标题")
    private String title;
    @Schema(description = "资讯作者")
    private String author;
    @Schema(description = "资讯内容长度")
    private Long length;
    @Schema(description = "内容")
    private String content;
    @Schema(description = "资讯创建时间")
    private LocalDateTime createTime;

}
