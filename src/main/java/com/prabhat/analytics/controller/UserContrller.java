package com.prabhat.analytics.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class UserContrller {
	
	@GetMapping("/v1/test")
	public String dummyResponse() {
		return "<h1>Sucess</h1>";
	}

}
