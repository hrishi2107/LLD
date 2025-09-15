package org.example;

import java.util.ArrayList;
import java.util.List;

public class User {
    int id;
    String name;
    Cart cart;
    List<int> orderIds;

    public User(int id, String name)
    {
        this.id = id;
        this.name =name;
        this.cart = new Cart();
        this.orderIds = new ArrayList<int>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    public List<int> getOrderIds() {
        return orderIds;
    }

    public void setOrderIds(List<int> orderIds) {
        this.orderIds = orderIds;
    }
}
