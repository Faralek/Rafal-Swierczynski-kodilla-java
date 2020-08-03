package com.kodilla.good.patterns.food2door;

public class Product {

    private final double productQuantity;
    private final String productType;

    public Product(double productQuantity, String productType) {
        this.productQuantity = productQuantity;
        this.productType = productType;
    }

    public double getProductQuantity() {
        return productQuantity;
    }

    public String getProductType() {
        return productType;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productQuantity=" + productQuantity +
                ", productType='" + productType + '\'' +
                '}';
    }
}
