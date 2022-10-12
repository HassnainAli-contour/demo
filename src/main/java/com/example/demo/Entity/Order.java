package com.example.demo.Entity;


import javax.persistence.*;

import static javax.persistence.GenerationType.SEQUENCE;

@Entity(name = "Order")
@Table(name = "order")
public class Order {
    @Id
    @SequenceGenerator(
            name = "order_sequence",
            sequenceName = "order_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = SEQUENCE,
            generator= "order_sequence"
    )
    private int id;

    @Column
    private String name;
    @Column
    private int price;

    @ManyToOne
    @JoinColumn(name="customer_id")
    private Customer customer;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
