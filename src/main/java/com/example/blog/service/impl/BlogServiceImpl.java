package com.example.blog.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.blog.entity.Blog;
import com.example.blog.mapper.BlogMapper;
import com.example.blog.service.BlogService;

public class BlogServiceImpl extends ServiceImpl<BlogMapper, Blog>
        implements BlogService {
}
