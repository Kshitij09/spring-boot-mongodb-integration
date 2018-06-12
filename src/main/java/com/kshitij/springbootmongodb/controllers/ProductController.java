package com.kshitij.springbootmongodb.controllers;

import com.kshitij.springbootmongodb.models.Product;
import com.kshitij.springbootmongodb.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    @Autowired
    ProductRepository repository;

    @RequestMapping(method = RequestMethod.GET,value = "/products")
    Iterable<Product> products() {
        return repository.findAll();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/products")
    String save(@RequestBody Product product) {
        repository.save(product);
        return product.getId();
    }
}
