package com.kodilla.good.patterns.food2door;

import com.kodilla.good.patterns.food2door.Manufacturer;
import com.kodilla.good.patterns.food2door.Order;

public class OrderInformation {

    public Order order;
    public boolean isDelivered;

    public OrderInformation(Order order, boolean isDelivered) {
        this.order = order;
        this.isDelivered = isDelivered;
    }

    @Override
    public String toString() {
        return "OrderInformation{" +
                ", order=" + order +
                ", isDelivered=" + isDelivered +
                '}';
    }

    public Order getOrder() {
        return order;
    }

    public boolean isDelivered() {
        return isDelivered;
    }


}
