package com.example.pokusaj100.service;

import com.example.pokusaj100.entity.OrderDetails;
import com.example.pokusaj100.repository.OrderDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service

public class OrderDetailsService {

    @Autowired
    OrderDetailsRepository orderDetailsRepository;

    public List<OrderDetails> getAllOrderDetails() {
        List<OrderDetails> orderDetails = new ArrayList<OrderDetails>();
        orderDetailsRepository.findAll().forEach(orderDetail -> orderDetails.add(orderDetail));
        return orderDetails;
    }

    public OrderDetails getOrderDetailsById(int id) {
        return orderDetailsRepository.findById(id).get();
    }

    public void saveOrUpdate(OrderDetails orderDetails) {
        orderDetailsRepository.save(orderDetails);
    }

    public void delete(int id) {
        orderDetailsRepository.deleteById(id);
    }


}
