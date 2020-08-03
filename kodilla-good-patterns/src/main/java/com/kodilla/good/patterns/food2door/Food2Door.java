package com.kodilla.good.patterns.food2door;

public class Food2Door {

    public static void main(String[] args) {

        Manufacturer extraFoodShop = new Manufacturer("ExtraFoodShop");
        Manufacturer healthyShop = new Manufacturer("HealthyShop");
        Manufacturer glutenFreeShop = new Manufacturer("GlutenFreeShop");

        Product milk = new Product(90, "Milk");
        Product sushi = new Product(70, "Sushi");
        Product spinach = new Product(120, "Spinach");
        Product milkShake = new Product(900, "Milk Shake");
        Product pasta = new Product(400, "Pasta");


        extraFoodShop.addProduct(sushi);
        extraFoodShop.addProduct(milk);

        healthyShop.addProduct(spinach);
        healthyShop.addProduct(milkShake);

        glutenFreeShop.addProduct(pasta);

        Order order = new Order(extraFoodShop,pasta);
        Order order1 = new Order(glutenFreeShop,pasta);

        OrderProcessor orderProcessor = new OrderProcessor();
        System.out.println("");

        if (orderProcessor.process(order1)){
            OrderInformation orderInformation = new OrderInformation(order,true);
            System.out.println(orderInformation);
        }else{
            OrderInformation orderInformation = new OrderInformation(order,false);
            System.out.println(orderInformation);
        }


    }

}
