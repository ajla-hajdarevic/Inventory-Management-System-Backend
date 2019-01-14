package com.example.pokusaj100.controller;


import com.example.pokusaj100.entity.Product;
import com.example.pokusaj100.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")

public class ProductController {

    @Autowired
    ProductService productService;


    @GetMapping("/products")
    private List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @GetMapping("/products/{id}")
    private Product getProduct(@PathVariable("id") int id) {
        return productService.getProductById(id);
    }

    @DeleteMapping("/products/{id}")
    private void deleteProduct(@PathVariable("id") int id) {
        productService.delete(id);
    }

    @PostMapping("/products")
    private int saveProduct(@RequestBody Product product) {
        productService.saveOrUpdate(product);
        return product.getId();
    }

}
