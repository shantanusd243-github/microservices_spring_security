
package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.userregistrationservice.UserRegistrationService;
import com.example.demo.vo.RegistrationVO;

@Controller
@RequestMapping("/user")
public class RegistrationController {
    @Autowired
	UserRegistrationService UserRegistrationService;
    
    @GetMapping("/register")
    public String showRegistrationForm(Model model) {
        return "registrationPage";
    }

    @PostMapping("/saveUserDetails")
    public String registerUser(@ModelAttribute RegistrationVO user,Model model) {
        // handle user registration logic here
    	Long saveUserRegistrationData = UserRegistrationService.saveUserRegistrationData(user);
        System.out.println("User registered: " + user.getName());
        System.out.println("Roles: " + user.getRoles());
        System.out.println("Id: " + saveUserRegistrationData);
        return "registrationPage";
    }
}
