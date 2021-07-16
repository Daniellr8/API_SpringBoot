package com.example.restservices;




import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;



@RestController
public class GreetingController {
	
	
	private final ServiceLayer serviceLayer;

	
	public GreetingController (ServiceLayer serviceLayer){
	this.serviceLayer = serviceLayer;
	}
	
	@GetMapping("/")
	public ResponseEntity<Data> getData() {
		return serviceLayer.consumeAPI();
		
	}
}