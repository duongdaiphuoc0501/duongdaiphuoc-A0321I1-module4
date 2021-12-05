package com.example.phantrang_timkiem.service;


import com.example.phantrang_timkiem.model.bean.Province;
import org.springframework.stereotype.Service;

@Service
public interface ProvinceService {
    Iterable<Province> findAll();

    Province findById(Long id);

    void save(Province province);

    void remove(Long id);
}