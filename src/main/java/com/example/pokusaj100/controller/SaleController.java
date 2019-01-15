package com.example.pokusaj100.controller;

import com.example.pokusaj100.entity.Sale;
import com.example.pokusaj100.service.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SaleController {

    @Autowired
    SaleService saleService;

    @GetMapping("/sales")
    private List<Sale> getAllSales() {
        return saleService.getAllSales();
    }

    @GetMapping("/sales/{id}")
    private Sale getSales(@PathVariable("id") int id) {
        return saleService.getSalesById(id);
    }

    @DeleteMapping("/sales/{id}")
    private void deleteSales(@PathVariable("id") int id) {
        saleService.delete(id);
    }

    @PostMapping("/sales")
    private int saveSale(@RequestBody Sale sale) {
        saleService.saveOrUpdate(sale);
        return sale.getId();
    }
}
