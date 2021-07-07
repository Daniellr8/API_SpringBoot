package com.example.restservices;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Greeting {
    private int id;
    private String result;

    public int getId(){
     return id;       
    }
    public void setId(int id){
        this.id = id;
    }
    public String getResult(){
        return result;       
    }
    public void setResult(String result){
        this.result = result;
    }
    
}
