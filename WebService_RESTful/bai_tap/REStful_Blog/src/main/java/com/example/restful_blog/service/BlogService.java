package com.example.restful_blog.service;

import com.example.restful_blog.model.Blog;
import com.example.restful_blog.model.Category;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BlogService {
    List<Blog> findAll();
    Blog findById(Long id);
    void save(Blog blog);
    void remove(Long id);
    Iterable<Blog> findAllByBlog(Category category);
}
