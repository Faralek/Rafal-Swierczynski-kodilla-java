package com.kodilla.good.patterns.challenges;

public class SaleProduct {

    private final String productName;
    private final String seller;
    private final double shipmentCost;
    private final double price;

    public SaleProduct(String productName, String seller, double shipmentCost, double price) {
        this.productName = productName;
        this.seller = seller;
        this.shipmentCost = shipmentCost;
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public String getSeller() {
        return seller;
    }

    public double getShipmentCost() {
        return shipmentCost;
    }

    public double getPrice() {
        return price;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SaleProduct)) return false;

        SaleProduct that = (SaleProduct) o;

        if (Double.compare(that.shipmentCost, shipmentCost) != 0) return false;
        if (Double.compare(that.price, price) != 0) return false;
        return seller != null ? seller.equals(that.seller) : that.seller == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = seller != null ? seller.hashCode() : 0;
        temp = Double.doubleToLongBits(shipmentCost);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
