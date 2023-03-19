package com.example.app.controller;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class LoginController {

    @PostMapping("/success-login")
    public String successLogin(RedirectAttributes redirectAttributes, Authentication authentication) {
        redirectAttributes.addFlashAttribute(
                HomeController.NOTIFICATION_ATTRIBUTE,
                "Welcome %s!".formatted(authentication.getName())
        );
        return "redirect:/";
    }
}
