package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class CartService {

    @Autowired
    private CartRepository cartRepository;

    public List<Cart> getAllCarts() {
        return cartRepository.findAll();
    }

    public Cart getCartByCartCode(String cartCode) {
        return cartRepository.findCartByCartCode(cartCode);
    }

    public Cart createCart(Cart cart) {
        return cartRepository.save(cart);
    }

    public Cart updateCart(int id, Cart cartDetails) {
        Cart cart = cartRepository.findCartById(id);

        bank.setCartCode(cartDetails.getCartCode());
        bank.setCartName(cartDetails.getCartName());

        return cartRepository.save(cart);
    }

    public void deleteCart(int id) {
        cartRepository.deleteCartById(id);
    }
}

