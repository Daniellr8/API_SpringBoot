package com.example.restservices;


import java.net.http.HttpHeaders;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;



@Service
public class ServiceLayer {
    private final RestTemplate restTemplate;
    
   
    

    @Autowired
    public ServiceLayer(RestTemplate restTemplate){
        this.restTemplate = restTemplate;
    }
    

    public ResponseEntity<Data> consumeAPI(){
        org.springframework.http.HttpHeaders headers= new org.springframework.http.HttpHeaders();
        headers.add("user-agent","Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/54.0.2840.99 Safari/537.36");
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.set("user-key", "*********");
        HttpEntity<String> entity = new HttpEntity<String>(headers);        
        ResponseEntity<Data> response =restTemplate.exchange("https://pokeapi.co/api/v2/berry?limit=64", HttpMethod.GET, entity, Data.class);
        return response;
    }
}
