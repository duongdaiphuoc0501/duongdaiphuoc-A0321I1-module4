package com.example.khach_hang.model.repository;

import com.example.khach_hang.model.bean.Customer;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRespository {
    List<Customer> findAll();

    void save(Customer customer);

    Customer findById(int id);

    void update(int id, Customer customer);

    void remove(int id);
}
