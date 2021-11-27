package com.example.blog.model.service;

import com.example.blog.model.bean.Blog;
import com.example.blog.model.bean.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public interface BlogService {
    Iterable<Blog> findAll();

    Blog findById(Long id);

    void save(Blog blog);

    void remove(Long id);

    Iterable<Blog> findAllByBlog(Category category);

    Page<Blog> findAll(Pageable pageable);

    Page<Blog> findAllByBlog_nameContaining(String blog_name, Pageable pageable);
}
