package com.kodilla.good.patterns.food2door;

import java.util.ArrayList;

public class GlutenFreeShop implements Manufacturer {

    private final String manufacturerName;
    private final ArrayList stock = new ArrayList();

    public GlutenFreeShop(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    @Override
    public boolean process(Order order) {
        System.out.println("Sprawdzanie dostępności");
        if (stock.contains(order.getProduct())) {
            System.out.println("Produkt dostępny");
        } else {
            System.out.println("Brak produktu na magazynie");
            System.out.println("Niepowodzenie zamówienia");
            return false;
        }
        System.out.println("Zamówienie zostało wykonane");
        return true;
    }


    @Override
    public void addProduct(Product product) {
        stock.add(product);
    }

    @Override
    public boolean isOnStock(Product product) {
        return stock.contains(product);
    }

    @Override
    public String getManufacturerName() {
        return manufacturerName;
    }

    @Override
    public String toString() {
        return "GlutenFreeShop{" +
                "manufacturerName='" + manufacturerName + '\'' +
                '}';
    }
}
