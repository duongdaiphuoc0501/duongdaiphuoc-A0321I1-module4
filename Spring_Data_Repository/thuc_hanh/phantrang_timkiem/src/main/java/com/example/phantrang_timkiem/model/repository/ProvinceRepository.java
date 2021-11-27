package com.example.phantrang_timkiem.model.repository;


import com.example.phantrang_timkiem.model.bean.Province;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProvinceRepository extends PagingAndSortingRepository<Province, Long> {

}
