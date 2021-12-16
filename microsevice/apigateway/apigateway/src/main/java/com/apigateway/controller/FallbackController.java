package com.apigateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackController {
	
	
	@GetMapping("/vehicleServiceFallback")
	public String vehicleServiceFallback() {
		return "vehicle Service is down at this time!!";
	}
	
	
	@GetMapping("/filmsServiceFallback")
	public String filmsServiceFallback() {
		return "films Service is down at this time!!";
	}

}
