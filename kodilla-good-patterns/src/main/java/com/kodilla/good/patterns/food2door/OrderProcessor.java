package com.kodilla.good.patterns.food2door;

public class OrderProcessor {

    public boolean processExtraFoodShop(Order order) {
        if (order.getManufacturer().getManufacturerName().equals("ExtraFoodShop")) {
            if (order.getManufacturer().isOnStock(order.getProduct())) {
                System.out.println("zamowienie zostało przekazane do realizacji w ExtraFoodShop" );
                return true;
            }
            System.out.println("danego produktu nie ma na stanie");
            return false;
        }
        return false;
    }

    public boolean processHealthyShop(Order order) {
        if (order.getManufacturer().getManufacturerName().equals("HealthyShop")) {
            if (order.getManufacturer().isOnStock(order.getProduct())) {
                System.out.println("zamowienie zostało przekazane do realizacji w HealthyShop");
                return true;
            }
            System.out.println("danego produktu nie ma na stanie");
            return false;
        }
        return false;
    }

    public boolean processGlutenFreeShop(Order order) {
        if (order.getManufacturer().getManufacturerName().equals("GlutenFreeShop")) {
            if (order.getManufacturer().isOnStock(order.getProduct())) {
                System.out.println("zamowienie zostało przekazane do realizacji w GlutenFreeShop");
                return true;
            }
            System.out.println("danego produktu nie ma na stanie");
            return false;
        }
        return false;
    }

    public boolean process(Order order){
        if(processHealthyShop(order)){
            return true;
        }
        if(processGlutenFreeShop(order)){
            return true;
        }
        if(processExtraFoodShop(order)){
            return true;
        }
        return false;
    }
}
