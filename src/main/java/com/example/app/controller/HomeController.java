package com.example.app.controller;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    String home(Model model, Authentication authentication) {
        if (authentication != null) {
            String name = authentication.getName();
            model.addAttribute("name", name);
        }
        return "index";
    }
}
