package com.example.demo.Controller;


import com.example.demo.Entity.Customer;
import com.example.demo.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController {


    @Autowired
    private CustomerService service ;
//    GenericDAOImpl manageCustomer;

    CustomerController(CustomerService service)
    {
        this.service = service;
    }

    @GetMapping("/Customers")
    public List<Customer> getCustomers()
    {
        return service.getAll();
    }

    @GetMapping("getCustomer")
    public Customer getCustomer(@RequestParam(value = "id",defaultValue = "-1") int id)
    {
        return service.get(id);            //!=null?p : null;
    }
    @PostMapping("/addCustomer")
    public String addCustomer(@RequestBody Customer Customer)
    {
        service.add(Customer);
        return "success ";
    }
    @PutMapping("/updateCustomer")
    public String updateCustomer(@RequestBody Customer Customer)
    {
        service.update(Customer);
        return "success ";
    }

    @DeleteMapping("/deleteCustomer")
    public String deleteCustomer(@RequestParam(value = "id",defaultValue = "-1") int id){
//        try(
        service.delete(id);
        return "success";
    }

}
