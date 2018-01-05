package com.springclientserver.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class UserController {
	
	
	@GetMapping("/get")
	public String getUser(){
		
		return "Welcome User";
	}

}
