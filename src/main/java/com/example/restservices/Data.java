package com.example.restservices;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties(ignoreUnknown = true)
public class Data {
    
    private List<Results> data;    

    public List<Results> getResults() {
        return data;
    }


    public void setResults(List<Results> data) {
        this.data = data;
    }
    
    
}
