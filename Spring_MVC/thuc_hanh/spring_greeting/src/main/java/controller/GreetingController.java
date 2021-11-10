package controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class GreetingController {
    @GetMapping("/greeting")
    public String greeting(@RequestParam String name, Model modle){
        modle.addAttribute("name", name);
        return "index";
    }
}
