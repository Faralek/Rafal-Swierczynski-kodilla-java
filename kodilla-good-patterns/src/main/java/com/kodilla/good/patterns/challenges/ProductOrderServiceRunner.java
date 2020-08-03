package com.kodilla.good.patterns.challenges;

public class ProductOrderServiceRunner {
    public static void main(String[] args) {

        InformationService informationService = new InformationService();
        SaleService saleService = new SaleService();
        SaleRepository saleRepository = new SaleRepository();
        SaleStorage saleStorage = new SaleStorage();

        SaleProcessor processor = new SaleProcessor(informationService, saleService, saleRepository, saleStorage);

        SaleProduct szczoteczka = new SaleProduct("Janusz",20,30);
        SaleProduct gumka = new SaleProduct("Janusz",5,20);
        SaleProduct wycieraczki = new SaleProduct("Janusz",10,50);
        SaleProduct kubek = new SaleProduct("Janusz",10,15);

        saleStorage.addProduct(szczoteczka);
        saleStorage.addProduct(gumka);
        saleStorage.addProduct(wycieraczki);

        SaleRequest saleOrder = new SaleRequest("Yass","Tokary 1",szczoteczka);
        SaleRequest saleOrder2 = new SaleRequest("Yass","Tokary 1", kubek);
        processor.process(saleOrder);
        processor.process(saleOrder2);

    }
}
