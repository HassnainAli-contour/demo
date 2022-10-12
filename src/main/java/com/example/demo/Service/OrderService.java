package com.example.demo.Service;

import com.example.demo.Entity.Order;
import com.example.demo.repository.OrderJPARep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService extends GenericService<Order>{
    @Autowired
    OrderService(OrderJPARep rep){
        this.repository = rep;
    }
}
