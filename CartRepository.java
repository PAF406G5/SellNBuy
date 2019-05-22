package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CartRepository extends JpaRepository<Cart, Integer> {

    public Cart findCartByCartCode(String cartCode);
    public void deleteCartById(int id);
    public Cart findCartById(int id);

}

