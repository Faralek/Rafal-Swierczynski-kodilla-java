package com.kodilla.good.patterns.challenges;

public class SaleDto {

    public String buyer;
    public boolean isSold;

    public SaleDto(String buyer, boolean isSold) {
        this.buyer = buyer;
        this.isSold = isSold;
    }

    public String getBuyer() {
        return buyer;
    }

    public boolean isSold() {
        return isSold;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SaleDto)) return false;

        SaleDto saleDto = (SaleDto) o;

        if (isSold != saleDto.isSold) return false;
        return buyer != null ? buyer.equals(saleDto.buyer) : saleDto.buyer == null;
    }

    @Override
    public int hashCode() {
        int result = buyer != null ? buyer.hashCode() : 0;
        result = 31 * result + (isSold ? 1 : 0);
        return result;
    }
}
