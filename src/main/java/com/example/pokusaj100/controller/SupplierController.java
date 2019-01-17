package com.example.pokusaj100.controller;

import com.example.pokusaj100.entity.Supplier;
import com.example.pokusaj100.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@CrossOrigin
@RestController
@RequestMapping("/api")
public class SupplierController {
    @Autowired
    SupplierService supplierService;

    @GetMapping("/suppliers")
    private List<Supplier> getAllSuppliers() {
        return supplierService.getAllSuppliers();
    }

    @GetMapping("/suppliers/{id}")
    private Supplier getSuppliers(@PathVariable("id") int id) {
        return supplierService.getSupplierById(id);
    }

    @DeleteMapping("/suppliers/{id}")
    private void deleteSupplier(@PathVariable("id") int id) {
        supplierService.delete(id);
    }

    @PostMapping("/suppliers")
    private int saveSupplier(@RequestBody Supplier supplier) {
        supplierService.saveOrUpdate(supplier);
        return supplier.getId();
    }
}
