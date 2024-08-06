package com.example.ShopCart;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.annotation.SessionScope;

import java.util.List;

@RestController
@RequestMapping("/store/order")
public class CartController {


    private final CartService cartService;

    public CartController(CartService cartService) {
        this.cartService = cartService;
    }

    @GetMapping("/add")
    public String add(@RequestParam("id") List<Long> cart) {
        cartService.addItem(cart);
        return "Товар успешно добавлен";
    }

    @GetMapping("/get")
    public List<Item> get() {
        return cartService.getCart();
    }
}
