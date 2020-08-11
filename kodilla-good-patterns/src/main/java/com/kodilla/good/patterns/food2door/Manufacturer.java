package com.kodilla.good.patterns.food2door;

public interface Manufacturer {

    String toString();

    boolean process(Order order);

    void addProduct(Product product);

    boolean isOnStock(Product product);

    String getManufacturerName();

}
