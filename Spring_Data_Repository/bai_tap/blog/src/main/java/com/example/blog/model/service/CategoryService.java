package com.example.blog.model.service;

import com.example.blog.model.bean.Category;
import org.springframework.stereotype.Service;

@Service
public interface CategoryService {
    Iterable<Category> findAll();

    Category findById(Long id);

    void save(Category category);

    void remove(Long id);
}
