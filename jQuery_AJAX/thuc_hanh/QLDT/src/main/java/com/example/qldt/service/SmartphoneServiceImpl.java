package com.example.qldt.service;

import com.example.qldt.model.Smartphone;
import com.example.qldt.repository.SmartphoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.Optional;

@Controller
public class SmartphoneServiceImpl implements SmartphoneService{
    @Autowired
    private SmartphoneRepository smartphoneRepository;

    @Override
    public Iterable<Smartphone> findAll() {
        return smartphoneRepository.findAll();
    }

    @Override
    public Optional<Smartphone> findById(Integer id) {
        Optional<Smartphone> smartphone = smartphoneRepository.findById(id);
        if(smartphone == null){
            return null;
        }
        return smartphone;
    }

    @Override
    public Smartphone save(Smartphone phone) {
        return smartphoneRepository.save(phone);
    }

    @Override
    public Optional<Smartphone> remove(Integer id) {
        Optional<Smartphone> smartphone = findById(id);
        smartphoneRepository.deleteById(id);
        return smartphone;
    }
}
