package com.simas.controller.guest;


import com.simas.domain.dto.SchoolDTO;
import com.simas.domain.resp.Result;
import com.simas.domain.vo.SchoolVO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 *  学校控制器
 * </p>
 *
 * @author yzc
 * @since 2024-05-22
 */
@RestController
@RequestMapping("/school")
@Tag(name = "院校库信息")
public class SchoolController {
    // TODO

    @GetMapping("/list")
    @Operation(summary = "首页院校库集合", description = "按热度列出前十条")
    public Result<SchoolVO> hot10() {
        return null;
    }

    @GetMapping("/rank/{name}")
    @Operation(summary = "获取指定排名", description = "根据排名获取院校信息")
    public Result<SchoolVO> rankByName(@Parameter(description = "排名名称") @PathVariable String rankName) {
        return null;
    }

    @GetMapping("/search/{region}")
    @Operation(summary = "根据地域获取院校", description = "根据地域获取院校信息")
    public Result<SchoolVO> searchByArea(@Parameter(description = "地区名称") @PathVariable String region) {
        return null;
    }
}
