package com.example.demo.Controller;


import com.example.demo.Entity.Order;
import com.example.demo.Service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OrderController {


    @Autowired
    private OrderService service ;
//    GenericDAOImpl manageorder;

    OrderController(OrderService service)
    {
        this.service = service;
    }

    @GetMapping("/orders")
    public List<Order> getorders()
    {
        return service.getAll();
    }

    @GetMapping("getorder")
    public Order getorder(@RequestParam(value = "id",defaultValue = "-1") int id)
    {
        return service.get(id);            //!=null?p : null;
    }
    @PostMapping("/addorder")
    public String addorder(@RequestBody Order order)
    {
        service.add(order);
        return "success ";
    }
    @PutMapping("/updateorder")
    public String updateorder(@RequestBody Order order)
    {
        service.update(order);
        return "success ";
    }

    @DeleteMapping("/deleteorder")
    public String deleteorder(@RequestParam(value = "id",defaultValue = "-1") int id){
//        try(
        service.delete(id);
        return "success";
    }

}
