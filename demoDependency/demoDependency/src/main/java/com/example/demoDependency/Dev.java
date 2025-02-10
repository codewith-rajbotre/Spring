package com.example.demoDependency;

import org.springframework.stereotype.Component;

@Component
public class Dev {
    public void print(){
        System.out.println("Dependency Injection Running");
    }
}
