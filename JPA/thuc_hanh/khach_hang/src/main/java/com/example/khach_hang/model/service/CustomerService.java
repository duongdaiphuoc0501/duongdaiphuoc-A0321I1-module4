package com.example.khach_hang.model.service;

import com.example.khach_hang.model.bean.Customer;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CustomerService {
    List<Customer> findAll();
    Customer findById(Long id);
    void save(Customer customer);
    void remove(Long id);
}
