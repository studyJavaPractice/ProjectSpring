package com.project.project_spring.repositories;

import org.springframework.data.repository.CrudRepository;

import com.project.project_spring.entities.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {
    boolean existsBySku(String sku);
}
