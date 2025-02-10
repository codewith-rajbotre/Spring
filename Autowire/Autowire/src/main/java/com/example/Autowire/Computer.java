package com.example.Autowire;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class Computer implements Desktop{
    public void compile(){
        System.out.println("Compiling from computer");
    }
}
