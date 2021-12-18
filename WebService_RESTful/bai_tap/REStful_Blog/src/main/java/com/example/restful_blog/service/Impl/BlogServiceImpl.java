package com.example.restful_blog.service.Impl;

import com.example.restful_blog.model.Blog;
import com.example.restful_blog.model.Category;
import com.example.restful_blog.repository.BlogRepository;
import com.example.restful_blog.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogServiceImpl implements BlogService {
    @Autowired
    BlogRepository blogRepository;

    @Override
    public List<Blog> findAll() {
        return blogRepository.findAll();
    }

    @Override
    public Blog findById(Long id) {
        return blogRepository.findById(id);
    }

    @Override
    public void save(Blog blog) {
        blogRepository.save(blog);
    }

    @Override
    public void remove(Long id) {
        blogRepository.remove(id);
    }

    @Override
    public Iterable<Blog> findAllByBlog(Category category) {
        return blogRepository.findAllByBlog(category);
    }
}
