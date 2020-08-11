package com.kodilla.good.patterns.challenges;

public class ProductOrderServiceRunner {
    public static void main(String[] args) {

        InformationService informationService = new InformationService();
        SaleService saleService = new SaleService();
        SaleRepository saleRepository = new SaleRepository();
        SaleStorage saleStorage = new SaleStorage();

        SaleProcessor processor = new SaleProcessor(informationService, saleService, saleRepository, saleStorage);

        SaleProduct product1 = new SaleProduct("szczoteczka","Janusz",20,30);
        SaleProduct product2 = new SaleProduct("gumka","Janusz",5,20);
        SaleProduct product3 = new SaleProduct("wycieraczki","Janusz",10,50);
        SaleProduct product4 = new SaleProduct("kubek","Janusz",10,15);

        saleStorage.addProduct(product1);
        saleStorage.addProduct(product2);
        saleStorage.addProduct(product3);
        saleStorage.addProduct(product4);

        SaleRequest saleOrder = new SaleRequest("Yass","Tokary 1",product1);
        SaleRequest saleOrder2 = new SaleRequest("Yass","Tokary 1", product2);
        processor.process(saleOrder);
        processor.process(saleOrder2);

    }
}
