package com.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.demo.entities.Order;
import com.demo.services.OrderService;

@SpringBootApplication
public class MyApp implements CommandLineRunner {

    @Autowired
    private OrderService service;
    
    @Override
    public void run(String... args) throws Exception {

        for(int i=1;i<5;i++)
            service.placeOrder(new Order("Item_"+i, (int)(Math.random()*10)));
        
    }
    
    public static void main(String[] args) {
        SpringApplication.run(MyApp.class, args);
    }
    
}
