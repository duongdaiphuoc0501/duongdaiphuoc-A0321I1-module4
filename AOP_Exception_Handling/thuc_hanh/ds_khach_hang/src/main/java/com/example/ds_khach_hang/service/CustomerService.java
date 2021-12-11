package com.example.ds_khach_hang.service;


import com.example.ds_khach_hang.bean.Customer;
import com.example.ds_khach_hang.bean.Province;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface CustomerService {
    Iterable<Customer> findAll();

    Optional<Customer> findById(Long id) throws Exception;

    void save(Customer customer);

    void remove(Long id);

    Iterable<Customer> findAllByProvince(Province province);
}