package com.simas.domain.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.io.Serializable;

@Data
@Schema(description = "学校排名")
public class SchoolRankDTO implements Serializable {
    @Schema(description = "排名名称", requiredMode = Schema.RequiredMode.REQUIRED)
    private String rankName;
    @Schema(description = "具体名次", requiredMode = Schema.RequiredMode.REQUIRED)
    private Long rankNo;
}
