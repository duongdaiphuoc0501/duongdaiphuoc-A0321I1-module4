package com.example.restful_blog.repository.Impl;

import com.example.restful_blog.model.Category;
import com.example.restful_blog.repository.CategoryRepository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;

@Transactional
public class CategoryRepositoryImpl implements CategoryRepository {
    @PersistenceContext
    private EntityManager em;

    @Override
    public List<Category> findAll() {
        TypedQuery<Category> query = em.createQuery("select c from Category c", Category.class);
        return query.getResultList();
    }

    @Override
    public Category findById(Long id) {
        return null;
    }

    @Override
    public void save(Category model) {

    }

    @Override
    public void remove(Long id) {

    }
}
