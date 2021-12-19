package com.example.qldt.repository;

import com.example.qldt.model.Smartphone;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SmartphoneRepository extends CrudRepository<Smartphone, Integer> {
}
