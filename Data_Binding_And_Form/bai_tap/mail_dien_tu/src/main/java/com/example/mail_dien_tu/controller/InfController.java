package com.example.mail_dien_tu.controller;

import com.example.mail_dien_tu.model.bean.Information;
import com.example.mail_dien_tu.model.repository.InfRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class InfController {
    @Autowired
    private InfRepository infRepository;

    @GetMapping("/")
    public ModelAndView index() {
        ModelAndView modelAndView = new ModelAndView("home", "inf", new Information());
        return modelAndView;
    }

    @GetMapping("/inf/infomation")
    public String create(Model model) {
        model.addAttribute("inf", new Information());
        return "/home";
    }

    @PostMapping("/inf/save")
    public String save(Information information) {
        infRepository.save(information);
        return "redirect:/";
    }
}
