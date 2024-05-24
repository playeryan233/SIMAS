package com.simas.service.impl;

import com.simas.domain.po.Post;
import com.simas.mapper.PostMapper;
import com.simas.service.IPostService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  发帖服务实现类，包括点赞，评论，评论的点赞
 * </p>
 *
 * @author yzc
 * @since 2024-05-22
 */
@Service
public class PostServiceImpl extends ServiceImpl<PostMapper, Post> implements IPostService {

}
