package com.naveen.thymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HellloWorldController {

	@GetMapping("/hello")
	public String hello(Model model)
	{
		model.addAttribute("message", "Hello World..");
		
		return "helloworld";
	}
}
