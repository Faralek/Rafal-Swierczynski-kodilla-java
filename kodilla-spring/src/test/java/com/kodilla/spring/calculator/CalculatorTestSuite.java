package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class CalculatorTestSuite {
    @Test
    public void testCalculations(){
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double val1 = calculator.add(2,3);
        double val2 = calculator.sub(5,2);
        double val3 = calculator.mul(7,7);
        double val4 = calculator.div(30,5);
        //Then
        Assert.assertEquals(5,val1,0);
        Assert.assertEquals(3,val2,0);
        Assert.assertEquals(49,val3,0);
        Assert.assertEquals(6,val4,0);
    }
}
