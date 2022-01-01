package com.example.ql_khach_hang.service.Impl;


import com.example.ql_khach_hang.bean.Customer;
import com.example.ql_khach_hang.bean.Province;
import com.example.ql_khach_hang.repository.CustomerRepository;
import com.example.ql_khach_hang.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerServiecImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public Iterable<Customer> findAll() {
        return customerRepository.findAll();
    }

    @Override
    public Optional<Customer> findById(Long id) throws Exception{
        Optional<Customer> target = customerRepository.findById(id);
        if (target == null) {
            throw new Exception("customer not found!");
        }
        return target;
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
    public Iterable<Customer> findAllByProvince(Province province) {
        return customerRepository.findAllByProvince(province);
    }
}
