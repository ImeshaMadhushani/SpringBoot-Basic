package com.springboot.MyFirstApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app")
public class AppController {

	@GetMapping("/msg")
	public String myMessage() {
		return "Hello SpringBoot";
	}
	
	@GetMapping("/name")
	public String  myName() {
		return "My name is Madhushani";
	}
	
	@GetMapping("/city")
	public String myCity() {
		return "My city is Kurunegala";
	}
	
	@GetMapping("/age")
	public String myAge() {
		return "My age is 24 years old";
	}
	
	@GetMapping("/course")
	public String myCourse() {
		return "I'm a IT student";
	}

	
}
