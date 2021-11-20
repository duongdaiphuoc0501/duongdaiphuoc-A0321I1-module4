package com.example.san_pham.model.reponsitory;

import model.bean.Product;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository {
    List<Product> findAll();
    void save(Product product);
    void update(int id , Product product);
    void remove(int id);
    Product findById(int id);
    void show(int id);
}
