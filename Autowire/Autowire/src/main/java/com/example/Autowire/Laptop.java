package com.example.Autowire;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class Laptop implements Desktop{
    public void compile(){
        System.out.println("Compiling the code with laptop");
    }
}
