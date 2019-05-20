package com.sharnel.OrderManagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sharnel.OrderManagement.model.Order;
import com.sharnel.OrderManagement.repository.OrderRepository;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class OrderService {

    @Autowired
    OrderRepository orderRepository;

    public List<Order> getAllOrders(){
        return orderRepository.findAll();
    }

    public Order getOrderByOrderId (int OrderId){
        return orderRepository.findOrderByOrderId(OrderId);
    }

    public Order createOrder (Order order){
        return orderRepository.save(order);
    }

    public Order updateOrder (int id, Order orderDetails){
    	Order order = orderRepository.findOrderById(id);

    	order.setOrderId(orderDetails.getOrderId());
    	order.setUserId(orderDetails.getUserId());
    	order.setCustomerName(orderDetails.getCustomerName());
    	order.setProductId(orderDetails.getProductId());
    	order.setOrderAmount(orderDetails.getOrderAmount());
    	order.setOrderDate(orderDetails.getOrderDate());

        return orderRepository.save(order);
    }
    public void deleteOrder(int id){
        orderRepository.deleteOrderById(id);
    }
}
