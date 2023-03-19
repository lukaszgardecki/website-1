package com.example.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    public static final String NOTIFICATION_ATTRIBUTE = "notification";

    @GetMapping("/")
    String home() {
        return "index";
    }
}
