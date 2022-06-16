package com.springboot.springbootfirstapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

	
	
@GetMapping("/welcome")	
	public String firstMethod()
	{
		String str="First Message";
		return str;
	}
	
}
