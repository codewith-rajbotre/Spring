package com.example.demoSpringWeb.controller;

import com.example.demoSpringWeb.model.Product;
import com.example.demoSpringWeb.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService service;

    @GetMapping("/prod")
    public List<Product> getProducts() {
        return service.getProducts();
    }
    @GetMapping("/prod/{prodId}")
    public Product getProductById(@PathVariable int prodId) {
        return service.getProductById(prodId);
    }
    @PostMapping("/prod")
    public void addProduct(@RequestBody Product prod) {
           service.addProduct(prod);

    }
    @PutMapping("/prod")
    public void updateProduct(@RequestBody Product prod){
        service.updateProduct(prod);
    }

    @DeleteMapping("/prod/{prodId}")
    public void deleteProduct(@PathVariable int prodId) {
                   service.deleteProduct(prodId);
    }
}

