package com.example.demoSpringWeb.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    @RequestMapping("/Login")
    public String Login(){
          return "This is login page";
    }
}
