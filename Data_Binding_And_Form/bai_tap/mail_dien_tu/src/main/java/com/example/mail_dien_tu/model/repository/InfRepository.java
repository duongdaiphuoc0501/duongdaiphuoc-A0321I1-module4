package com.example.mail_dien_tu.model.repository;

import com.example.mail_dien_tu.model.bean.Information;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InfRepository{
    public void save(Information information);
}
