package com.example.ShopCart;

import java.util.ArrayList;
import java.util.List;

public interface CartService {
    void addItem(List<Long> listID);

    List<Item> getCart();
}
