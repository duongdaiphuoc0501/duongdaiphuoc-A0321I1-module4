package com.example.furama.service.Impl;

import com.example.furama.model.Customer;
import com.example.furama.model.CustomerType;
import com.example.furama.repository.CustomerRepository;
import com.example.furama.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiecImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public Iterable<Customer> findAll() {
        return customerRepository.findAll();
    }

    @Override
    public Customer findById(Long id) {
        return customerRepository.findById(id).orElse(null);
    }

    @Override
    public void save(Customer customer) {
        customerRepository.save(customer);
    }

    @Override
    public void remove(Long id) {
        customerRepository.deleteById(id);
    }

    @Override
    public Iterable<Customer> findAllByCustomerType(CustomerType customerType) {
        return customerRepository.findAllByCustomerType(customerType);
    }

    @Override
    public Page<Customer> findAll(Pageable pageable) {
        return customerRepository.findAll(pageable);
    }

    @Override
    public Page<Customer> findAllByCustomerNameContaining(String customerName, Pageable pageable) {
        return customerRepository.findAllByCustomerNameContaining(customerName, pageable);
    }
}
