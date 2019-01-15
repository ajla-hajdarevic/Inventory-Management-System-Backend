package com.example.pokusaj100.repository;

//import com.example.pokusaj100.entity.Order;
import com.example.pokusaj100.entity.Order_;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order_, Integer> {
}
