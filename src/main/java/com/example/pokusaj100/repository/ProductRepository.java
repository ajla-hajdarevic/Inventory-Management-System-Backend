package com.example.pokusaj100.repository;

import com.example.pokusaj100.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {}
