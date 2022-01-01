package com.example.furama.service;



import com.example.furama.model.Customer;
import com.example.furama.model.CustomerType;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public interface CustomerService {
    Iterable<Customer> findAll();

    Customer findById(Long id);

    void save(Customer customer);

    void remove(Long id);

    Iterable<Customer> findAllByCustomerType(CustomerType customerType);

    Page<Customer> findAll(Pageable pageable);

    Page<Customer> findAllByCustomerNameContaining(String customerName, Pageable pageable);
}