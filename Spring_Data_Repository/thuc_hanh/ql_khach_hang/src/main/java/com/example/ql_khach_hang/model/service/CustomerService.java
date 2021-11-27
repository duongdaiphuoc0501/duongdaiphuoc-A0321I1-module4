package com.example.ql_khach_hang.model.service;

import com.example.ql_khach_hang.model.bean.Customer;
import com.example.ql_khach_hang.model.bean.Province;
import org.springframework.stereotype.Service;

@Service
public interface CustomerService {
    Iterable<Customer> findAll();

    Customer findById(Long id);

    void save(Customer customer);

    void remove(Long id);

    Iterable<Customer> findAllByProvince(Province province);
}