package com.tastekorea.webapp.main.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainIndexController {
	
	@GetMapping("/")
	public String index() {
		return "index";
	}

}
