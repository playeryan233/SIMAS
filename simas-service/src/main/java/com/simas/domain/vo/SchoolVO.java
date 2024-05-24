package com.simas.domain.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Schema(description = "学校信息")
public class SchoolVO implements Serializable {
    @Schema(description ="学校ID")
    private Long id;
    @Schema(description ="学校名称")
    private String name;
    @Schema(description ="学校图片")
    private String image;
    @Schema(description ="学校链接")
    private String link;
    @Schema(description ="学校国家")
    private String country;
    @Schema(description ="学校排名")
    private List<SchoolRankVO> ranks;
}
