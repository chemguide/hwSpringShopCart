package com.example.ShopCart;

import org.apache.el.stream.Stream;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;

@Service
@SessionScope
public class CartServiceImpl implements CartService {


    private List<Item> cart = new ArrayList<>();

    public void addItem(List<Long> listID) {
        for (Long aLong : listID) {
            cart.add(new Item(aLong));
        }
    }

    public List<Item> getCart() {
        return this.cart;
    }

}
