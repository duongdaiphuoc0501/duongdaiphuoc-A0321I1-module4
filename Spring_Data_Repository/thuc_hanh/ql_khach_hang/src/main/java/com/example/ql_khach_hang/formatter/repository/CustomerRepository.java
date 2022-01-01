package com.example.ql_khach_hang.formatter.repository;

import com.example.ql_khach_hang.formatter.bean.Customer;
import com.example.ql_khach_hang.formatter.bean.Province;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CustomerRepository extends PagingAndSortingRepository<Customer, Long> {
    Iterable<Customer> findAllByProvince(Province province);

//    Customer findOne(Long id);
//
//    void delete(Long id);
}
