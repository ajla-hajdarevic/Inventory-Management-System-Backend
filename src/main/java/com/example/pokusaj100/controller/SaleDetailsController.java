package com.example.pokusaj100.controller;

import com.example.pokusaj100.entity.SaleDetails;
import com.example.pokusaj100.service.SaleDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@CrossOrigin
@RestController
@RequestMapping("/api")
public class SaleDetailsController {

    @Autowired
    SaleDetailsService saleDetailsService;

    @GetMapping("/saleDetails")
    private List<SaleDetails> getAllSaleDetails() {
        return saleDetailsService.getAllSaleDetails();
    }

    @GetMapping("/saleDetails/{id}")
    private SaleDetails getSalesDetails(@PathVariable("id") int id) {
        return saleDetailsService.getSalesDetailById(id);
    }

    @DeleteMapping("/saleDetails/{id}")
    private void deleteSalesDetails(@PathVariable("id") int id) {
        saleDetailsService.delete(id);
    }

    @PostMapping("/salesDetails")
    private int saveSale(@RequestBody SaleDetails saleDetails) {
        saleDetailsService.saveOrUpdate(saleDetails);
        return saleDetails.getId();
    }
}
