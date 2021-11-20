package com.example.san_pham.model.service;

import model.bean.Product;
import com.example.san_pham.model.reponsitory.ProductReponstoryImpl;
import com.example.san_pham.model.reponsitory.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServicelmpl implements ProductService {
    private ProductRepository productRepository = new ProductReponstoryImpl();

    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public void save(Product product) {
        productRepository.save(product);
    }

    @Override
    public void update(int id, Product product) {
        productRepository.update(id, product);
    }

    @Override
    public void remove(int id) {
        productRepository.remove(id);
    }

    @Override
    public Product findById(int id) {
        return productRepository.findById(id);
    }

    @Override
    public void show(int id) {
        productRepository.show(id);
    }
}
