package com.example.demo.Entity;

import org.springframework.beans.factory.annotation.Value;

public class MyEntity
    {
        //final int id2=2;
        @Value("$default.entity.id")
        private int id;
        @Value("$default.entity.name")
        String name;

        public MyEntity() {
        }


        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public long getId() {
            return this.id;
        }

        public void setId(int id) {
            this.id = id;
        }

    }
