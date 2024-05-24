package com.simas.controller.admin;

import com.simas.domain.dto.SchoolDTO;
import com.simas.domain.resp.Result;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin/school")
@Tag(name = "院校管理", description = "院校管理")
public class SchoolManageController {

    @PostMapping
    @Operation(summary = "添加或者更新院校", description = "添加或者更新院校信息")
    public Result addSchool(@RequestBody SchoolDTO schoolDTO) {
        return null;
    }

    @DeleteMapping
    @Operation(summary = "删除院校", description = "删除院校信息")
    public Result deleteSchool(@RequestBody SchoolDTO schoolDTO) {
        return null;
    }
}
