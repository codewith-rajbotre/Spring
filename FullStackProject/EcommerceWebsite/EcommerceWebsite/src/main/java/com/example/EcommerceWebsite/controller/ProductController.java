package com.example.EcommerceWebsite.controller;

import com.example.EcommerceWebsite.model.Product;
import com.example.EcommerceWebsite.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class ProductController {

    @Autowired
    private ProductService service;

    @RequestMapping("/")
    public String greet(){

        return "Welcome to Ecommerce Website";
    }

    @GetMapping("/products")
    public List<Product> getAllProducts(){
             return service.getAllProducts();
    }


}
