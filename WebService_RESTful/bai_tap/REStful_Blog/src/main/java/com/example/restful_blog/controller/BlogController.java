package com.example.restful_blog.controller;


import com.example.restful_blog.model.Blog;
import com.example.restful_blog.model.Category;
import com.example.restful_blog.service.BlogService;
import com.example.restful_blog.service.CategoryService;
import com.example.restful_blog.service.Impl.CategoryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;
import java.util.Optional;

@RestController
public class BlogController {
    @Autowired
    BlogService blogService;
    @Autowired
    CategoryService categoryService;

    @ModelAttribute("categories")
    public  Iterable<Category> categories(){
        return categoryService.findAll();
    }


    @RequestMapping(value = "/blogs/", method = RequestMethod.GET)
    public ResponseEntity<List<Blog>> listAllBlogs() {
        List<Blog> blogs = blogService.findAll();
        if (blogs.isEmpty()) {
            return new ResponseEntity<List<Blog>>(HttpStatus.NO_CONTENT);//You many decide to return HttpStatus.NOT_FOUND
        }
        return new ResponseEntity<List<Blog>>(blogs, HttpStatus.OK);
    }


    @RequestMapping(value = "/blogs/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Blog> getBlog(@PathVariable("id") long id) {
        System.out.println("Fetching Blog with id " + id);
        Blog blog = blogService.findById(id);
        if (blog == null) {
            System.out.println("Blog with id " + id + " not found");
            return new ResponseEntity<Blog>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<Blog>(blog, HttpStatus.OK);
    }


    @RequestMapping(value = "/customers/", method = RequestMethod.POST)
    public ResponseEntity<Void> createBlog(@RequestBody Blog blog, UriComponentsBuilder ucBuilder) {
        System.out.println("Creating Blog " + blog.getBlog_name());
        blogService.save(blog);
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(ucBuilder.path("/customers/{id}").buildAndExpand(blog.getBlog_id()).toUri());
        return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
    }


    @RequestMapping(value = "/blogs/{id}", method = RequestMethod.PUT)
    public ResponseEntity<Blog> updateBlog(@PathVariable("id") long id, @RequestBody Blog blog) {
        System.out.println("Updating Blog " + id);

        Blog currentBlog = blogService.findById(id);

        if (currentBlog == null) {
            System.out.println("Blog with id " + id + " not found");
            return new ResponseEntity<Blog>(HttpStatus.NOT_FOUND);
        }

        currentBlog.setBlog_name(blog.getBlog_name());
        currentBlog.setCategory(blog.getCategory());
        currentBlog.setStatus(blog.getStatus());
        currentBlog.setBlog_id(blog.getBlog_id());

        blogService.save(currentBlog);
        return new ResponseEntity<Blog>(currentBlog, HttpStatus.OK);
    }


    @RequestMapping(value = "/blogs/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Blog> deleteBlog(@PathVariable("id") long id) {
        System.out.println("Fetching & Deleting Blog with id " + id);

        Blog customer = blogService.findById(id);
        if (customer == null) {
            System.out.println("Unable to delete. Customer with id " + id + " not found");
            return new ResponseEntity<Blog>(HttpStatus.NOT_FOUND);
        }

        blogService.remove(id);
        return new ResponseEntity<Blog>(HttpStatus.NO_CONTENT);
    }
}
