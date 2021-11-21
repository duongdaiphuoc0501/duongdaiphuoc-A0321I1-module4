package com.example.mail_dien_tu.controller;

import com.example.mail_dien_tu.model.bean.Information;
import com.example.mail_dien_tu.model.repository.InfRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;
import java.util.List;

@Controller
public class InfController {
    @GetMapping("/")
    public String showView(){
        return "home";
    }

    @PostMapping("/inf/save")
    public String save(@RequestParam("language") String language,@RequestParam("size") String size, @RequestParam("fillter") String fillter,@RequestParam("signature") String signature,Model model) {
        model.addAttribute("inf", new Information(language, size, fillter, signature));
        return "information";
    }
}
