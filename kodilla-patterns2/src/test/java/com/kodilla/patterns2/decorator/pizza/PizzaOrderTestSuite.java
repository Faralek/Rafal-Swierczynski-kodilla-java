package com.kodilla.patterns2.decorator.pizza;

import com.kodilla.patterns2.decorator.pizza.decorators.ChickenPizzaDecorator;
import com.kodilla.patterns2.decorator.pizza.decorators.CornPizzaDecorator;
import com.kodilla.patterns2.decorator.pizza.decorators.PineapplePizzaDecorator;
import com.kodilla.patterns2.decorator.pizza.decorators.SalamiPizzaDecorator;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class PizzaOrderTestSuite {
    @Test
    public void testBasicPizzaWithSalamiChickenCornPineappleGetCost() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new SalamiPizzaDecorator(pizzaOrder);
        pizzaOrder = new ChickenPizzaDecorator(pizzaOrder);
        pizzaOrder = new CornPizzaDecorator(pizzaOrder);
        pizzaOrder = new PineapplePizzaDecorator(pizzaOrder);
        //When
        BigDecimal pizzaCost = pizzaOrder.getCost();
        //Then
        assertEquals(new BigDecimal(30), pizzaCost);

    }

    @Test
    public void testBasicPizzaWithSalamiChickenCornPineappleGetDescription() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new SalamiPizzaDecorator(pizzaOrder);
        pizzaOrder = new ChickenPizzaDecorator(pizzaOrder);
        pizzaOrder = new CornPizzaDecorator(pizzaOrder);
        pizzaOrder = new PineapplePizzaDecorator(pizzaOrder);
        //When
        String description = pizzaOrder.getDescription();
        //Then
        assertEquals("Pizza with tomato sauce and cheese + salami + chicken + corn + pineapple", description);
    }
}