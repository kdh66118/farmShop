package com.myapp.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testController {
	
	@GetMapping("helloWorld")
	public String helloWorld() {
		return "hello world";
	}
}
