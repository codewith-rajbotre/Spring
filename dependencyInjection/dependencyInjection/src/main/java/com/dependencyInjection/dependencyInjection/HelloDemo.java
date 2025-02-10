package com.dependencyInjection.dependencyInjection;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloDemo {
    @RequestMapping
    public String Hello(){
        return "Hello SpringBoot";
    }

}
