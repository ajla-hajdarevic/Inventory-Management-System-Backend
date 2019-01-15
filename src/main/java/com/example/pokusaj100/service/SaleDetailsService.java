package com.example.pokusaj100.service;

import com.example.pokusaj100.entity.SaleDetails;
import com.example.pokusaj100.repository.SaleDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service

public class SaleDetailsService {
    @Autowired
    SaleDetailsRepository saleDetailsRepository;


    public List<SaleDetails> getAllSaleDetails() {
        List<SaleDetails> salesDetails = new ArrayList<SaleDetails>();
        saleDetailsRepository.findAll().forEach(saleDetail -> salesDetails.add(saleDetail));
        return salesDetails;
    }

    public SaleDetails getSalesDetailById(int id) {
        return saleDetailsRepository.findById(id).get();
    }

    public void saveOrUpdate(SaleDetails order) {
        saleDetailsRepository.save(order);
    }

    public void delete(int id) {
        saleDetailsRepository.deleteById(id);
    }


}
