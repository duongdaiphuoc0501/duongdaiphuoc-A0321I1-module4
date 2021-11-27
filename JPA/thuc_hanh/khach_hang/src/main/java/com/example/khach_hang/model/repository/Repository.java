package com.example.khach_hang.model.repository;

import java.util.List;

@org.springframework.stereotype.Repository
public interface Repository<T> {
    List<T> findAll();
    T findById(Long id);
    void save(T model);
    void remove(Long id);
}
