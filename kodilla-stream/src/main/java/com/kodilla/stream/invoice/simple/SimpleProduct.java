package com.kodilla.stream.invoice.simple;

public final class SimpleProduct {
    private final String productName;
    private final double productPrice;

    public SimpleProduct(String productName, double productPrice) {
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public String getProductName() {
        return productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SimpleProduct)) return false;

        SimpleProduct that = (SimpleProduct) o;

        if (Double.compare(that.productPrice, productPrice) != 0) return false;
        return productName != null ? productName.equals(that.productName) : that.productName == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = productName != null ? productName.hashCode() : 0;
        temp = Double.doubleToLongBits(productPrice);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "SimpleProduct{" +
                "productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                '}';
    }
}
