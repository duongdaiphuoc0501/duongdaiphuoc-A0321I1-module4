package com.example.san_pham.model.service;

import model.bean.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductService {
    List<Product> findAll();
    static void save(Product product);
    static void update(int id, Product product);
    static void remove(int id);
    static Object findById(int id);
    void show(int id);
}
