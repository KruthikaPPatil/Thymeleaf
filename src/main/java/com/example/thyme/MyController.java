package com.example.thyme;

import java.util.Random;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ch.qos.logback.core.model.Model;

@Controller
public class MyController {
	
	
	@GetMapping("/")
	public String loadHome() {
		return "sample.html";
	}
   
	@GetMapping("/otp")
	public String load(ModelMap map) {
		int otp = new Random().nextInt(1000,10000);
		map.put("otp", otp);
		return "sample.html";
	}
	
	
	@PostMapping("/circle")
	public String circle(ModelMap map,@RequestParam String color,@RequestParam String height,@RequestParam String width) {
	map.put("color", color);	
	map.put("height", height);	
	map.put("width", width);	
	return "sample.html";
	}
	
	


	
}
