package com.simas.domain.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.io.Serializable;

@Data
@Schema(description = "帖子信息")
public class PostDTO implements Serializable {
    @Schema(description = "标题", requiredMode = Schema.RequiredMode.REQUIRED)
    private String title;
    @Schema(description = "内容", requiredMode = Schema.RequiredMode.REQUIRED)
    private String content;
}
