package com.example.restful_blog.repository;

import com.example.restful_blog.model.Blog;
import com.example.restful_blog.model.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlogRepository extends com.example.restful_blog.repository.Repository<Blog> {
    Iterable<Blog> findAllByBlog(Category category);
}
