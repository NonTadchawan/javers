package com.example.demojavers1.controller;

import com.example.demojavers1.domain.Product;
import com.example.demojavers1.jpa.ProductJpaRepo;
import org.javers.spring.annotation.JaversAuditable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/product")
public class ProductControl {
    private final ProductJpaRepo repository;

    public ProductControl(ProductJpaRepo repository) {
        this.repository = repository;
    }

    @PostMapping
    public void saveProduct(@RequestBody Product product){
        repository.save(product);
    }
}
