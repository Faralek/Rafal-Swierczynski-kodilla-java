package com.kodilla.good.patterns.food2door;

import java.util.ArrayList;

public class Manufacturer {

    private final String manufacturerName;
    private ArrayList productsOnStock = new ArrayList();


    public Manufacturer(String manufacturerName) {
        this.manufacturerName = manufacturerName;

    }

    public void addProduct(Product product) {
        productsOnStock.add(product);
        System.out.println("dodano produkt " + product.getProductType() +" do magazynu producenta " + manufacturerName);
    }

    public boolean isOnStock(Product product) {
        return productsOnStock.contains(product);
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Manufacturer)) return false;

        Manufacturer that = (Manufacturer) o;

        if (manufacturerName != null ? !manufacturerName.equals(that.manufacturerName) : that.manufacturerName != null)
            return false;
        return productsOnStock != null ? productsOnStock.equals(that.productsOnStock) : that.productsOnStock == null;
    }

    @Override
    public int hashCode() {
        int result = manufacturerName != null ? manufacturerName.hashCode() : 0;
        result = 31 * result + (productsOnStock != null ? productsOnStock.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Manufacturer{" +
                "manufacturerName='" + manufacturerName + '\'' +
                '}';
    }
}
