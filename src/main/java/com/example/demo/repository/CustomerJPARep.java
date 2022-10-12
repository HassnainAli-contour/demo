package com.example.demo.repository;

import com.example.demo.Entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerJPARep extends JpaRepository<Customer,Integer> {
}
