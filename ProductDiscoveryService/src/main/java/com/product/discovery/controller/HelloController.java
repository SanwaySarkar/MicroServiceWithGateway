package com.product.discovery.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/getHello")
public class HelloController {

	@GetMapping("/data")
	public String getHelloData() {
		return "welcome";
	}
}
