package com.web.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

	@RequestMapping("/")
	public String home() {
		System.out.println("this is demo project of jsp");
		return "home";
	}
	
	@RequestMapping("/contect")
	public String contect() {
		System.out.println("this is demo project of jsp");
		return "contect";
	}
}
