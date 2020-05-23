package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {

    @Test
    public void testGetPeopleQuantity(){
        World world = new World();

        Continent europe = new Continent("europe");
        Continent africa = new Continent("africa");

        world.addContinent(europe);
        world.addContinent(africa);

        europe.addCountry(new Country("Poland", new BigDecimal("37970647")));
        africa.addCountry(new Country("Algieria",new BigDecimal("40969443")));

        BigDecimal testWorldPeopleQuantity = world.getPeopleQuantity();
        BigDecimal totalPeopleQuantity = new BigDecimal("78940090");
        Assert.assertEquals(totalPeopleQuantity,testWorldPeopleQuantity);
    }
}
