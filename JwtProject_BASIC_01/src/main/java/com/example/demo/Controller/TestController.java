package com.example.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/")
public class TestController {

	@GetMapping("/home")
	public String welcome()
	{
		return "Welcome to home, adding new changes for pull request 2nd commit adding change";
		
	}
}
