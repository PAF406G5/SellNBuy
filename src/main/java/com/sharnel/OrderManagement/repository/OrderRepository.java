package com.sharnel.OrderManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sharnel.OrderManagement.model.Order;

public interface OrderRepository extends JpaRepository<Order,Integer>{
	
	public Order findOrderByOrderId(int OrderId);
    public void deleteOrderById (int id);
    public Order findOrderById (int id);

}
