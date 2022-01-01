package com.example.ql_khach_hang.formatter.service;

import com.example.ql_khach_hang.formatter.bean.Province;
import org.springframework.stereotype.Service;

@Service
public interface ProvinceService {
    Iterable<Province> findAll();

    Province findById(Long id);

    void save(Province province);

    void remove(Long id);
}