package com.example.pokusaj100.controller;

import com.example.pokusaj100.entity.Order_;
import com.example.pokusaj100.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class OrderController {
    @Autowired
    OrderService orderService;

    @GetMapping("/orders")
    private List<Order_> getAllOrders() {
        return orderService.getAllOrders();
    }

    @GetMapping("/orders/{id}")
    private Order_ getOrders(@PathVariable("id") int id) {
        return orderService.getOrderById(id);
    }

    @DeleteMapping("/orders/{id}")
    private void deleteOrder(@PathVariable("id") int id) {
        orderService.delete(id);
    }

    @PostMapping("/orders")
    private int saveOrder(@RequestBody Order_ order) {
        orderService.saveOrUpdate(order);
        return order.getId();
    }
}
