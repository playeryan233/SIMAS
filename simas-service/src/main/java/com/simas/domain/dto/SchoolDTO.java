package com.simas.domain.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
@Schema(description = "院校信息")
public class SchoolDTO implements Serializable {
    @Schema(description = "院校id，有则是更新，无则是增加", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    private Long id;
    @Schema(description = "院校名称", requiredMode = Schema.RequiredMode.REQUIRED)
    private String name;
    @Schema(description = "院校图片，以URL形式描述", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    private String image;
    @Schema(description = "院校链接，以URL形式描述", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    private String link;
    @Schema(description = "国家", requiredMode = Schema.RequiredMode.REQUIRED)
    private String country;
    @Schema(description = "院校排名，以数组形式给出", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    List<SchoolRankDTO> ranks;
}
