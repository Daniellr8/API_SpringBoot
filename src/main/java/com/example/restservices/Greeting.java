package com.example.restservices;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Greeting {
    private int id;
    private String next;
    private String previous;
    private String results;

    public String getPrevious() {
        return previous;
    }
    public void setPrevious(String previous) {
        this.previous = previous;
    }

    public String getNext() {
        return next;
    }
    public void setNext(String next) {
        this.next = next;
    }
    public int getId(){
     return id;       
    }
    public void setId(int id){
        this.id = id;
    }
    public String getResults(){
        return results;       
    }
    public void setResults(String results){
        this.results = results;
    }
    
}
