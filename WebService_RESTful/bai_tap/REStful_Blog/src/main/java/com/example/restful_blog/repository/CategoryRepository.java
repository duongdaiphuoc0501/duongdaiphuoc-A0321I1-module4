package com.example.restful_blog.repository;

import com.example.restful_blog.model.Category;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends com.example.restful_blog.repository.Repository<Category> {
}
