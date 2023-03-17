package com.example.app.controller;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping("/user")
    public String userPage(Model model, Authentication authentication) {
        String name = authentication.getName();
        model.addAttribute("name", name);
        return "login_success";
    }
}
