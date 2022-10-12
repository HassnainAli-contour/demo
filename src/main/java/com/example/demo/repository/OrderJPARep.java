package com.example.demo.repository;

import com.example.demo.Entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OrderJPARep extends JpaRepository<Order,Integer> {
}
