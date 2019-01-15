package com.example.pokusaj100.service;

//import com.example.pokusaj100.entity.Order;
import com.example.pokusaj100.entity.Order_;
import com.example.pokusaj100.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service

public class OrderService {

    @Autowired
    OrderRepository orderRepository;

    public List<Order_> getAllOrders() {
        List<Order_> orders = new ArrayList<Order_>();
        orderRepository.findAll().forEach(order -> orders.add(order));
        return orders;
    }

    public Order_ getOrderById(int id) {
        return orderRepository.findById(id).get();
    }

    public void saveOrUpdate(Order_ order) {
        orderRepository.save(order);
    }

    public void delete(int id) {
        orderRepository.deleteById(id);
    }

}
