package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CartController {

    @Autowired
    private CartService cartService;

    @GetMapping(value = "/utils/carts", params = "cart_code")
    public ResponseEntity<Cart> getCartByCartCode(@RequestParam(name = "cart_code") String cartCode) {
        return new ResponseEntity<>(cartService.getCartByCartCode(cartCode), HttpStatus.OK);
    }

    @GetMapping("/utils/cartsd")
    public ResponseEntity<List<Cart>> getAllCarts() {
        return new ResponseEntity<>(bankService.getAllCarts(), HttpStatus.OK);
    }

    @PostMapping("utils/carts")
    public ResponseEntity<Cart> createCart(@RequestBody Cart cart) {
        return new ResponseEntity<>(cartService.createCart(cart), HttpStatus.OK);
    }

    @PutMapping("/utils/carts/{id}")
    public ResponseEntity<Bank> updateCart(@PathVariable int id, @RequestBody Cart cart) {
        return new ResponseEntity<Cart>(cartService.updateCart(id, cart), HttpStatus.OK);
    }

    @DeleteMapping("utils/carts/{id}")
    public ResponseEntity deleteCart(@PathVariable int id) {
        cartService.deleteCart(id);
        return new ResponseEntity(HttpStatus.OK);
    }
}
