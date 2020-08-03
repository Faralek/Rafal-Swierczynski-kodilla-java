package com.kodilla.good.patterns.challenges;

public class SaleRequest {

    private final String buyer;
    private final String buyerAddress;
    private final SaleProduct saleProduct;

    public SaleRequest(String buyer, String buyerAddress, SaleProduct saleProduct) {
        this.buyer = buyer;
        this.buyerAddress = buyerAddress;
        this.saleProduct = saleProduct;
    }

    public String getBuyer() {
        return buyer;
    }

    public String getBuyerAddress() {
        return buyerAddress;
    }

    public SaleProduct getSaleProduct() {
        return saleProduct;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SaleRequest)) return false;

        SaleRequest that = (SaleRequest) o;

        if (buyer != null ? !buyer.equals(that.buyer) : that.buyer != null) return false;
        if (buyerAddress != null ? !buyerAddress.equals(that.buyerAddress) : that.buyerAddress != null) return false;
        return saleProduct != null ? saleProduct.equals(that.saleProduct) : that.saleProduct == null;
    }

    @Override
    public int hashCode() {
        int result = buyer != null ? buyer.hashCode() : 0;
        result = 31 * result + (buyerAddress != null ? buyerAddress.hashCode() : 0);
        result = 31 * result + (saleProduct != null ? saleProduct.hashCode() : 0);
        return result;
    }
}
