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
@Schema(description = "资讯信息")
public class NewsVO {
    @Schema(description = "资讯ID")
    private Long id;
    @Schema(description = "资讯标题")
    private String title;
    @Schema(description = "资讯简要内容，内容不长可以作为详细内容")
    private String brief;
    @Schema(description = "资讯创建时间")
    private LocalDateTime createTime;
}
