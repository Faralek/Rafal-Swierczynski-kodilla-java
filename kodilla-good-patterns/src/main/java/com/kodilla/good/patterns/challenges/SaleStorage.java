package com.kodilla.good.patterns.challenges;

import java.util.ArrayList;

public class SaleStorage {

    private final ArrayList<SaleProduct> storage = new ArrayList<>();

    public ArrayList<SaleProduct> getStorage() {
        return storage;
    }

    public void addProduct(SaleProduct saleProduct) {
        storage.add(saleProduct);
    }

    public void removeProduct(SaleProduct saleProduct) {
        storage.remove(saleProduct);
    }

    public boolean onStock(SaleProduct saleProduct) {
        if (storage.contains(saleProduct)) {
            return true;
        }
        return false;
    }


}
