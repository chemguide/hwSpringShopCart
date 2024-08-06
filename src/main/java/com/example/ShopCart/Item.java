package com.example.ShopCart;

import java.util.Objects;

public class Item {
    private long id;

    public Item(long id) {
        this.id = id;
    }

    public long getId(){
        return this.id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return id == item.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    //@Override
   // public String toString() {
    //    return String.valueOf(this.id);
    //}
}
