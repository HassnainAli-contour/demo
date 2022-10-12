package com.example.demo.Service;

import com.example.demo.Entity.Customer;
import com.example.demo.repository.CustomerJPARep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService extends GenericService<Customer> {
    @Autowired
    CustomerService(CustomerJPARep rep){
        this.repository = rep;
    }
}
