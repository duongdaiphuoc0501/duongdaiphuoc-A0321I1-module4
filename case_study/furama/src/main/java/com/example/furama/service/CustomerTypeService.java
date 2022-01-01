package com.example.furama.service;

import com.example.furama.model.CustomerType;
import org.springframework.stereotype.Service;

@Service
public interface CustomerTypeService {
    Iterable<CustomerType> findAll();

    CustomerType findById(Long id);

    void save(CustomerType customerType);

    void remove(Long id);
}
