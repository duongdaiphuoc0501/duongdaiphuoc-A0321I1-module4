package com.example.form_dang_ki.service;

import com.example.form_dang_ki.model.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    Iterable<User> findAll();

    User findById(Long id);

    void save(User user);
}
