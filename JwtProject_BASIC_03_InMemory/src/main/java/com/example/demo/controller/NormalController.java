package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("v1/")
public class NormalController {

	@GetMapping("/home")
	public String welcome()
	{
		return "Welcome to home before login";
		
	}
}
