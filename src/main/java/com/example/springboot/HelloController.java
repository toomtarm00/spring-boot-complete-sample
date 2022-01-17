package com.example.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/myspring")
public class HelloController {

	@GetMapping("/hello")
	public String index() {
		return "Greetings from Spring Boot!";
	}

	@RequestMapping("/x")
	public String home() {
		return "Hello Docker World";
	}
	
	@RequestMapping("/")
	public String homeX() {
		return "Greetings from Spring Boot!";
	}

}
