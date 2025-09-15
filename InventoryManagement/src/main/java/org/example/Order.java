package org.example;

import java.util.Map;

public class Order {
    int id;
    User user;
    Address address;
    Map<int,int> categoryIdvsCount;
    Warehouse warehouse;
    Invoice invoice;
    Payment payment;
    OrderStatus status;
}
