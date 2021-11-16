package com.example.may_tinh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MaytinhController {
    @GetMapping("/tinh")
    public String showView(){
        return "maytinh";
    }

    @PostMapping("/tinh")
    public String Caculator(@RequestParam("a") int a, @RequestParam("b") int b, @RequestParam("caculator") String caculator, Model model){
        int result = 0;
        switch (caculator){
            case "Addition(+)":
                result = a + b;
                break;
            case "Subtraction(-)":
                result = a - b;
                break;
            case "Multiplication(X)":
                result = a * b;
                break;
            case "Division(/)":
                result = a / b;
                break;
        }
        model.addAttribute("result", result);
        return  "maytinh";
    }
}
