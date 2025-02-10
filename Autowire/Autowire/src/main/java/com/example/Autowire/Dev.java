package com.example.Autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Dev {
    @Autowired     //field injection
    @Qualifier("laptop")
    private Desktop desktop  ;

//    public Dev(Laptop laptop) {  //Constructor Injection
//        this.laptop = laptop;
//    }

//    @Autowired
//    public void setLaptop(Laptop laptop) {  //Setter Injection
//        this.laptop = laptop;
//    }
    public void build(){
     desktop.compile();
        System.out.println("Building Dev");
    }
}
