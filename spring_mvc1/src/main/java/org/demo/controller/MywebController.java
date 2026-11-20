package org.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MywebController {
	@ResponseBody
	@RequestMapping("/home")
	
	public String home() {
		return "welcome to Spring mvc";
		
	}
	
	@ResponseBody
	@RequestMapping("/About")
	public String About() {
		return "Welcome to about";
	}
	

}
//http://localhost:8080/spring_mvc1/home