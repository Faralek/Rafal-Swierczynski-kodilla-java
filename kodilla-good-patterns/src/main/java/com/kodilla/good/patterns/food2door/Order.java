package com.kodilla.good.patterns.food2door;

public class Order {

    private final Manufacturer manufacturer;
    private final Product product;

    public Order(Manufacturer manufacturer, Product product) {
        this.manufacturer = manufacturer;
        this.product = product;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public Product getProduct() {
        return product;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Order)) return false;

        Order order = (Order) o;

        if (manufacturer != null ? !manufacturer.equals(order.manufacturer) : order.manufacturer != null) return false;
        return product != null ? product.equals(order.product) : order.product == null;
    }

    @Override
    public int hashCode() {
        int result = manufacturer != null ? manufacturer.hashCode() : 0;
        result = 31 * result + (product != null ? product.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Order{" +
                "manufacturer=" + manufacturer +
                ", product=" + product +
                '}';
    }
}
