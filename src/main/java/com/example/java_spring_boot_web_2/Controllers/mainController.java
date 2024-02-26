package com.example.java_spring_boot_web_2.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class mainController {


    @GetMapping("/about")
    public String about(Model model) {
        model.addAttribute("title","About");
        return "about"; // Змінено ім'я перегляду
    }


    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("title", "Головна сторінка");
        return "home";
    }
}