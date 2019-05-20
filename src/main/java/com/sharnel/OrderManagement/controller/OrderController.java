package com.sharnel.OrderManagement.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.sharnel.OrderManagement.model.Order;
import com.sharnel.OrderManagement.service.OrderService;

import java.util.List;

@RestController
public class OrderController {

    @Autowired
    OrderService orderService;

    @GetMapping(value= "/OrderManagement/orders", params = "OrderId" )
    public ResponseEntity<Order> getOrderByOrderId (@RequestParam(name = "OrderId")int OrderId){
        return new ResponseEntity<Order> (orderService.getOrderByOrderId(OrderId), HttpStatus.OK);
    }
    
    @GetMapping("OrderManagement/orders")
    public ResponseEntity<List<Order>> getAllOrders(){
        return new ResponseEntity<List<Order>>(orderService.getAllOrders(),HttpStatus.OK);
    }

    @PostMapping("OrderManagement/orders")
    public ResponseEntity<Order> createOrder(@RequestBody Order order){
        return new ResponseEntity<Order>(orderService.createOrder(order), HttpStatus.OK);
    }

    @PutMapping("OrderManagement/orders/{id}")
    public ResponseEntity<Order> updateOrder (@PathVariable int id, @RequestBody Order order){
        return new ResponseEntity<Order>(orderService.updateOrder(id, order),HttpStatus.OK);
    }
        
    @DeleteMapping("OrderManagement/orders/{id}")
    public ResponseEntity deleteOrder (@PathVariable int id){
    	orderService.deleteOrder(id);
        return new ResponseEntity(HttpStatus.OK);

    }
}