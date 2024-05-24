package com.simas.service.impl;

import com.simas.domain.po.News;
import com.simas.mapper.NewsMapper;
import com.simas.service.INewsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  新闻资讯服务实现类
 * </p>
 *
 * @author yzc
 * @since 2024-05-22
 */
@Service
public class NewsServiceImpl extends ServiceImpl<NewsMapper, News> implements INewsService {

}
