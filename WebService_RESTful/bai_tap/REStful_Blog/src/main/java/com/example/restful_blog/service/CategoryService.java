package com.example.restful_blog.service;

import com.example.restful_blog.model.Blog;
import com.example.restful_blog.model.Category;

import java.util.List;

public interface CategoryService {
    List<Category> findAll();
    Category findById(Long id);
    void save(Category category);
    void remove(Long id);
}
