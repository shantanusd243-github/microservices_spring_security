package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CustomUICOntroller {

    //localhost:8080/v3/home
    @GetMapping("v3/home")
    public String home() {
        return "home";
    }
    //localhost:8080/v1/login
    @GetMapping("login")
    public String login() {
        return "login";
    }
   
    @GetMapping("/home")
    public String successScreen() {
        return "success"; // Returns the home.html template
    }
}
