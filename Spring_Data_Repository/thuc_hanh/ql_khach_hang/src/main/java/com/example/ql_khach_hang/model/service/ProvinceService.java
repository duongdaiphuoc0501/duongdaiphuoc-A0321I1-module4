package com.example.ql_khach_hang.model.service;

import com.example.ql_khach_hang.model.bean.Province;
import org.springframework.stereotype.Service;

@Service
public interface ProvinceService {
    Iterable<Province> findAll();

    Province findById(Long id);

    void save(Province province);

    void remove(Long id);
}