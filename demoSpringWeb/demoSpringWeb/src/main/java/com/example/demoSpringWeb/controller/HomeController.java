package com.example.demoSpringWeb.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //1st way to do it
//@Controller
//@ResponseBody //2nd way to do it
public class HomeController {
    @RequestMapping("/")
    public String greet(){
        return "Hello Web  ";
    }
    @RequestMapping("/About")
    public String Welcome(){
        return "Hello welcome to about Page";
    }
}
