package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void testPizzaNew() {
        //Given
        Bigmac bigmac = new Bigmac.BurgerBuilder()
                .bun("Normal")
                .burgers("Classic")
                .sauce("Spicy")
                .ingredient("Bacon")
                .ingredient("Cheese")
                .ingredient("Onion")
                .build();
        System.out.println(bigmac);
        //When
        int howManyIngredients = bigmac.getIngredients().size();
        String whatBun = bigmac.getBun();
        String whatBurgers = bigmac.getBurgers();
        String whatSauce = bigmac.getSauce();

        //Then
        Assert.assertEquals(3, howManyIngredients);
        Assert.assertEquals("Normal",whatBun);
        Assert.assertEquals("Classic",whatBurgers);
        Assert.assertEquals("Spicy",whatSauce);
    }
}