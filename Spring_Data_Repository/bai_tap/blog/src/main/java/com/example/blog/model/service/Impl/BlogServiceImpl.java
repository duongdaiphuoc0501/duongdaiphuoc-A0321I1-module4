package com.example.blog.model.service.Impl;

import com.example.blog.model.bean.Blog;
import com.example.blog.model.bean.Category;
import com.example.blog.model.repository.BlogRepository;
import com.example.blog.model.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class BlogServiceImpl implements BlogService {
    @Autowired
    BlogRepository blogRepository;

    @Override
    public Iterable<Blog> findAll() {
        return blogRepository.findAll();
    }

    @Override
    public Blog findById(Long id) {
        return blogRepository.findById(id).orElse(null);
    }

    @Override
    public void save(Blog blog) {
        blogRepository.save(blog);
    }

    @Override
    public void remove(Long id) {
        blogRepository.findById(id);
    }

    @Override
    public Iterable<Blog> findAllByBlog(Category category) {
        return blogRepository.findAllByBlog(category);
    }

    @Override
    public Page<Blog> findAll(Pageable pageable) {
        return blogRepository.findAll(pageable);
    }

    @Override
    public Page<Blog> findAllByBlog_nameContaining(String blog_name, Pageable pageable) {
        return blogRepository.findAllByBlog_nameContaining(blog_name, pageable);
    }
}
