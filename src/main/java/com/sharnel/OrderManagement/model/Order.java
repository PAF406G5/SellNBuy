package com.sharnel.OrderManagement.model;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Order")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "OrderId", nullable = false, unique = true)
    private int OrderId;

    @Column(name = "UserId", nullable = false )
    private int UserId;

    @Column(name ="CustomerName", nullable = false)
    private String CustomerName;

    @Column(name = "ProductId",nullable = true)
    private int ProductId;

    @Column(name = "Amount", nullable = true)
    private Float Amount;

    @Column(name = "Date", nullable = true)
    private Date OrderDate;
  

    @Column(name = "created_at")
    @CreationTimestamp
    private Date createdAt;

    @Column(name = "updated_at")
    @UpdateTimestamp
    private Date updatedAt;

    public Order(){

    }

    public Order(int OrderId, int UserId, String CustomerName, int ProductId, Float Amount,Date OrderDate){
        this.setOrderId(OrderId);
        this.setUserId(UserId);
        this.setCustomerName(CustomerName);
        this.setProductId(ProductId);
        this.setOrderAmount(Amount);
        this.setOrderDate(OrderDate);
       
    }

    public int getId() {
        return id;
    }
    
    public int getOrderId() {
        return OrderId;
    }
    
    
    public void setOrderId(int OrderId) {
        this.OrderId = OrderId;
    }
    
    
    
    public int getUserId() {
        return UserId;
    }
    
    
    public void setUserId(int UserId) {
        this.UserId = UserId;
    }
    
   
    
    public String getCustomerName() {
        return CustomerName;
    }
    
    
    public void setCustomerName(String CustomerName) {
        this.CustomerName = CustomerName;
    }
    
    public int getProductId() {
        return ProductId;
    }
    
    
    public void setProductId(int ProductId) {
        this.ProductId = ProductId;
    }
    
    public float getOrderAmount() {
        return Amount;
    }
    
    
    public void setOrderAmount(float Amount) {
        this.Amount = Amount;
    }
    
    public Date getOrderDate() {
        return OrderDate;
    }
    
    
    public void setOrderDate(Date OrderDate) {
        this.OrderDate = OrderDate;
    }
    
    


    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}
