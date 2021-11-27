package com.example.ql_khach_hang.model.repository;

import com.example.ql_khach_hang.model.bean.Customer;
import com.example.ql_khach_hang.model.bean.Province;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CustomerRepository extends PagingAndSortingRepository<Customer, Long> {
    Iterable<Customer> findAllByProvince(Province province);

//    Customer findOne(Long id);
//
//    void delete(Long id);
}
