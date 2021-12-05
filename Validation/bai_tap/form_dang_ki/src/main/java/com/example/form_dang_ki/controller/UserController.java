package com.example.form_dang_ki.controller;

import com.example.form_dang_ki.model.User;
import com.example.form_dang_ki.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/user")
    public String showCreateForm( Model model){
        model.addAttribute("user", new User());
        return "user/create";
    }

    @PostMapping("/user")
    public String saveUser(@Validated @ModelAttribute("user") User user, BindingResult bindingResult, Model model){
        if(bindingResult.hasErrors()){
            return "user/create";
        }
        userService.save(user);
        model.addAttribute("user", new User());
        return "redirect:/user/result";
    }
}
