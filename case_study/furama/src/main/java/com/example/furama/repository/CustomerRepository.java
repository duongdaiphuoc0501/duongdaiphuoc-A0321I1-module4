package com.example.furama.repository;


import com.example.furama.model.Customer;
import com.example.furama.model.CustomerType;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends PagingAndSortingRepository<Customer, Long> {
    Iterable<Customer> findAllByCustomerType(CustomerType customerType);
    Page<Customer> findAllByCustomerNameContaining(String customerName, Pageable pageable);
}
