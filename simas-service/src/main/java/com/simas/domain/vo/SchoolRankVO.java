package com.simas.domain.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Schema(description = "学校排名")
public class SchoolRankVO {
    @Schema(description = "排名名称")
    private String rankName;
    @Schema(description = "名次")
    private Long rankNo;
}
