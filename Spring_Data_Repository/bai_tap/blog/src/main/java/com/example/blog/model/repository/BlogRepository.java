package com.example.blog.model.repository;

import com.example.blog.model.bean.Blog;
import com.example.blog.model.bean.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlogRepository extends PagingAndSortingRepository<Blog, Long> {
    Iterable<Blog> findAllByBlog(Category category);
    Page<Blog> findAllByBlog_nameContaining(String blog_name, Pageable pageable);
}
