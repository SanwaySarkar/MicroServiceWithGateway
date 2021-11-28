package com.product.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

	@Autowired
	Environment env;
	
	@GetMapping("/get")
	public String getDetails() {
		return "Product details "+env.getProperty("local.server.port");
	}
}
