package com.example.pokusaj100.service;



import com.example.pokusaj100.entity.Supplier;
import com.example.pokusaj100.repository.SupplierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service

public class SupplierService {

    @Autowired
    SupplierRepository supplierRepository;

    public List<Supplier> getAllSuppliers() {
        List<Supplier> suppliers = new ArrayList<Supplier>();
        supplierRepository.findAll().forEach(supplier -> suppliers.add(supplier));
        return suppliers;
    }

    public Supplier getSupplierById(int id) {
        return supplierRepository.findById(id).get();
    }

    public void saveOrUpdate(Supplier order) {
        supplierRepository.save(order);
    }

    public void delete(int id) {
        supplierRepository.deleteById(id);
    }

}
