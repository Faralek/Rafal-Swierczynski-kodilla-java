package com.kodilla.good.patterns.food2door;

public class OrderProcessor {

    public boolean processOrder(Order order) {
        return order.getManufacturer().process(order);
    }
}
