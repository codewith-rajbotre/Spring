package com.example.demoSpringWeb.service;

import com.example.demoSpringWeb.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Service
public class ProductService {

    List<Product> products = new ArrayList<>( Arrays.asList(
            new Product(101,"Phone", 1000),
            new Product(102,"IPhone", 3000)));


    public List<Product> getProducts(){
        return products;
    }

    public Product getProductById(int prodId) {
        return products.stream()
                .filter(p->p.getProdId()==prodId)
                .findFirst().orElse(new Product(100, "No Item", 0));
    }

    public void addProduct(Product prod) {
        products.add(prod);
    }


}
