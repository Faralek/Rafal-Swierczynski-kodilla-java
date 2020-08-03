package com.kodilla.good.patterns.challenges;

public class SaleService {

    public boolean sale(SaleProduct saleProduct, SaleStorage saleStorage) {
        if (saleStorage.onStock(saleProduct)) {
            System.out.println("Sprzedaż została zarejestrona w systemie");
            return true;
        }
        System.out.println("nie posiadamy danego produktu na magazynie");
        return false;
    }

}
