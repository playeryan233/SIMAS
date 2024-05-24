package com.simas.domain.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@Schema(description = "新闻信息")
public class NewsDTO implements Serializable {
    @Schema(description = "新闻ID，有则是更新，无则是发布", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    private Long id;
    @Schema(description = "新闻标题", requiredMode = Schema.RequiredMode.REQUIRED)
    private String title;
    @Schema(description = "新闻内容", requiredMode = Schema.RequiredMode.REQUIRED)
    private String content;
}
