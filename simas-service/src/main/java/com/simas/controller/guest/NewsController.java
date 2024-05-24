package com.simas.controller.guest;


import com.simas.domain.resp.Result;
import com.simas.domain.vo.NewsContentVO;
import com.simas.domain.vo.NewsVO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author yzc
 * @since 2024-05-22
 */
@RestController
@RequestMapping("/news")
@Tag(name = "新闻资讯")
public class NewsController {

    @GetMapping("/list")
    @Operation(summary = "获取新闻资讯", description = "获取最新的新闻资讯")
    public Result<List<NewsVO>> list(){
        return null;
    }

    @GetMapping("/detail/{id}")
    @Operation(summary = "获取新闻详情", description = "获取指定新闻的详情")
    public Result<NewsContentVO> detail(@Parameter(description = "新闻id") @PathVariable("id") Long id){
        return null;
    }

    @GetMapping("/area/{region}")
    @Operation(summary = "获取地区新闻资讯", description = "获取最新的地区新闻资讯，多个地区请严格按逗号分隔")
    public Result<List<NewsVO>> area(@Parameter(description = "地区名称") @PathVariable String region){
        return null;
    }

    @GetMapping("/search/{keyword}")
    @Operation(summary = "搜索新闻资讯", description = "根据关键字搜索新闻资讯")
    public Result<List<NewsVO>> search(@Parameter(description = "关键词") @PathVariable String keyword){
        return null;
    }
}
