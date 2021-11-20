package com.example.mail_dien_tu.model.repository;

import com.example.mail_dien_tu.model.bean.Information;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class InfRepositoryImpl implements InfRepository{
    private static List<Information> informations;

    @Override
    public void save(Information information) {
        informations.add(information);
    }
}
