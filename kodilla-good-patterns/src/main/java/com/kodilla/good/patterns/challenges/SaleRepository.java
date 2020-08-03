package com.kodilla.good.patterns.challenges;

import java.util.ArrayList;

public class SaleRepository {

    private ArrayList<SaleRequest> sales = new ArrayList<>();

    public void createSale(SaleRequest saleRequest){
        sales.add(saleRequest);
        System.out.println("zlecenie sprzedaży zostało dodane do historii zamówień");
    }

    public void removeSale(SaleRequest saleRequest){
        sales.remove(saleRequest);
        System.out.println("zlecenie sprzedaży zostało usunięte z historii zamówień");
    }


}
