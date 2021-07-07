package com.example.restservices;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class GreetingController {
	
	
	private final ServiceLayer serviceLayer;

	
	public GreetingController (ServiceLayer serviceLayer){
	this.serviceLayer = serviceLayer;
	}

	@GetMapping("/frutas")
	public ResponseEntity<Greeting> getData() {
		return new ResponseEntity<> (serviceLayer.consumeAPI(),HttpStatus.OK);
		
	}
}