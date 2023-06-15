package com.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {

	
	@GetMapping("/hello")
	public String hello() {
		System.out.println("hello");
		return "hello this is demo";
	}

		


	
	
	@GetMapping("/test")
	public String testing() {
		
		return "testing";
	}
}
