package com.springboot.springbootfirstapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

	
	
@GetMapping("/welcome")	
	public String firstMethod()
	{
	int a=1;
		String str="First Message";
		String str2="Second Message";
		if(a==1)
		{
		return str2;
		}
		else 
			return str;
	}
	
}
