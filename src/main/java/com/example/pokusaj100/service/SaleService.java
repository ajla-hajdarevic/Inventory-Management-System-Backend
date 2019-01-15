package com.example.pokusaj100.service;

import com.example.pokusaj100.entity.Sale;
import com.example.pokusaj100.repository.SaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service

public class SaleService {

    @Autowired
    SaleRepository saleRepository;

    public List<Sale> getAllSales() {
        List<Sale> sales = new ArrayList<Sale>();
        saleRepository.findAll().forEach(sale -> sales.add(sale));
        return sales;
    }

    public Sale getSalesById(int id) {
        return saleRepository.findById(id).get();
    }

    public void saveOrUpdate(Sale sale) {
        saleRepository.save(sale);
    }

    public void delete(int id) {
        saleRepository.deleteById(id);
    }

}
