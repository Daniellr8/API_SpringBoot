package com.example.restservices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;



@Service
public class ServiceLayer {
    private final RestTemplate restTemplate;
    
    @Autowired
    public ServiceLayer(RestTemplate restTemplate){

        this.restTemplate = restTemplate;
    }

    public Greeting consumeAPI(){
        return restTemplate.getForObject("https://pokeapi.co/api/v2/berry",
        Greeting.class);
    }
    
   
}
