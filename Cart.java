package com.example.demo;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "carts")
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "cart_code", nullable = false, unique = true)
    private String cartCode;

    @Column(name = "cart_name", nullable = false)
    private String cartName;

    @Column(name = "created_at")
    @CreationTimestamp
    private Date createdAt;

    @Column(name = "updated_at")
    @UpdateTimestamp
    private Date updatedAt;

    public Cart() {

    }

    public Cart(String cartCode, String cartName) {
        this.setCartCode(cartCode);
        this.setCartName(cartName);
    }

    public int getId() {
        return id;
    }

    public String getCartCode() {
        return cartCode;
    }

    public void setcartCode(String cartCode) {
        this.cartCode = cartCode;
    }

    public String getCartName() {
        return cartName;
    }

    public void setCartName(String CartName) {
        this.cartName = cartName;
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
