package com.spring.assignment.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmployeeController {

	@GetMapping("/")
	public String home() {
		// TODO Auto-generated constructor stub
		return "index";
	}

}