package org.example;

import java.util.ArrayList;
import java.util.List;

public class OrderController {
    List<Order> orderList;

    OrderController()
    {
        orderList = new ArrayList<>();
    }

    public void addOrder(Order order)
    {
        orderList.add(order);
    }
    public void removeOrder(Order order)
    {
        orderList.remove(order);
    }


}
