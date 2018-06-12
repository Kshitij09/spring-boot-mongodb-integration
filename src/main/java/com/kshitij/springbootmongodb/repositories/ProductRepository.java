package com.kshitij.springbootmongodb.repositories;

import com.kshitij.springbootmongodb.models.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface ProductRepository extends CrudRepository<Product, String> {
    @Override
    Optional<Product> findById(String id);

    @Override
    void delete(Product product);
}
