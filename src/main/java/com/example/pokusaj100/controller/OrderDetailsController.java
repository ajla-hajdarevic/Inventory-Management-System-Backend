package com.example.pokusaj100.controller;

import com.example.pokusaj100.entity.OrderDetails;
import com.example.pokusaj100.service.OrderDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class OrderDetailsController {
    @Autowired
    OrderDetailsService orderDetailsService;

    @GetMapping("/orderDetails")
    private List<OrderDetails> getAllOrderDetails() {
        return orderDetailsService.getAllOrderDetails();
    }

    @GetMapping("/orderDetails/{id}")
    private OrderDetails getOrderDetails(@PathVariable("id") int id) {
        return orderDetailsService.getOrderDetailsById(id);
    }

    @DeleteMapping("/orderDetails/{id}")
    private void deleteOrderDetails(@PathVariable("id") int id) {
        orderDetailsService.delete(id);
    }

    @PostMapping("/orderDetails")
    private int saveOrderDetails(@RequestBody OrderDetails orderDetails) {
        orderDetailsService.saveOrUpdate(orderDetails);
        return orderDetails.getId();
    }
}
