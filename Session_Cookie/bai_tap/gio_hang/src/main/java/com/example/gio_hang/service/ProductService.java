package com.example.gio_hang.service;

import com.example.gio_hang.model.Product;

public interface ProductService {

    Iterable<Product> findAll();

    Product findById(Long id);

    void save(Product customer);

    void remove(Long id);
}
