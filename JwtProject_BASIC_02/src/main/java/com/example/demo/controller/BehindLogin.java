package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("v2/")
public class BehindLogin {

	@GetMapping("/home")
	public String welcome()
	{
		return "Welcome to home after login";
		
	}
}
