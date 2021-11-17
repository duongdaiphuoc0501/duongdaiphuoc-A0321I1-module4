package com.example.khach_hang.model.service.Impl;

import com.example.khach_hang.model.bean.Customer;
import com.example.khach_hang.model.repository.CustomerRespository;
import com.example.khach_hang.model.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerRespository customerRespository;

    @Override
    public List<Customer> findAll() {
        return customerRespository.findAll();
    }

    @Override
    public void save(Customer customer) {
        customerRespository.save(customer);
    }

    @Override
    public Customer findById(int id) {
        return customerRespository.findById(id);
    }

    @Override
    public void update(int id, Customer customer) {
        customerRespository.update(id, customer);
    }

    @Override
    public void remove(int id) {
        customerRespository.remove(id);
    }
}
