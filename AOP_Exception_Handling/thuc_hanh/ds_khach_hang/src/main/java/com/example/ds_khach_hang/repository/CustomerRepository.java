package com.example.ds_khach_hang.repository;


import com.example.ds_khach_hang.bean.Customer;
import com.example.ds_khach_hang.bean.Province;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends PagingAndSortingRepository<Customer, Long> {
    Iterable<Customer> findAllByProvince(Province province);

}
