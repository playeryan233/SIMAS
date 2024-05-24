package com.simas.controller.admin;

import com.simas.domain.dto.NewsDTO;
import com.simas.domain.resp.Result;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin/news")
@Tag(name = "新闻管理", description = "新闻管理")
public class NewsManageController {

    @DeleteMapping("/{id}")
    @Operation(summary = "删除新闻", description = "删除指定新闻")
    public Result deleteNews(@Parameter(description = "新闻id") @PathVariable("id") Long id) {
        return null;
    }


    @PostMapping("/ban/{id}")
    @Operation(summary = "下架新闻", description = "下架指定新闻")
    public Result banNews(@Parameter(description = "新闻id") @PathVariable("id") Long id) {
        return null;
    }

    @PostMapping
    @Operation(summary = "发布或更新新闻", description = "发布或更新新闻")
    public Result publishNews(@RequestBody NewsDTO newsDTO) {
        return null;
    }

}
