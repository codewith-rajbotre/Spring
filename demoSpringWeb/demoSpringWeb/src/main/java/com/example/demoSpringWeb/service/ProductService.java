package com.example.demoSpringWeb.service;

import com.example.demoSpringWeb.model.Product;
import com.example.demoSpringWeb.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Service
public class ProductService {

    @Autowired
    ProductRepo repo;

//    List<Product> products = new ArrayList<>( Arrays.asList(
//            new Product(101,"Phone", 1000),
//            new Product(102,"IPhone", 3000)));
//

    public List<Product> getProducts(){
        return repo.findAll();
    }

    public Product getProductById(int prodId) {
        return repo.findById(prodId).orElse(new Product());
    }

    public void addProduct(Product prod) {
        repo.save(prod);
    }


    public void updateProduct(Product prod) {
       repo.save(prod);
    }

    public void deleteProduct(int prodId) {
       repo.deleteById(prodId);
    }
}
