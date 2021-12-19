package com.example.qldt.service;

import com.example.qldt.model.Smartphone;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface SmartphoneService {
    Iterable<Smartphone> findAll();
    Optional<Smartphone> findById(Integer id);
    Smartphone save(Smartphone phone);
    Optional<Smartphone> remove(Integer id);
}
