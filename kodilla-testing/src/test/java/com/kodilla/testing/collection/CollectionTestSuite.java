package com.kodilla.testing.collection;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class CollectionTestSuite {

    @Before
    public void before() {
        System.out.println("Test Case: begin");
    }

    @After
    public void after() {
        System.out.println("Test Case: end");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList() {
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        ArrayList<Integer> list = new ArrayList();
        ArrayList<Integer> emptyList = new ArrayList();

        System.out.println("rozmiar listy wynosi: " + list.size());

        ArrayList result = (exterminator.exterminate(list));
        Assert.assertEquals(emptyList, result);
    }

    @Test
    public void testOddNumbersExterminatorNormalList() {
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        ArrayList<Integer> list = new ArrayList();
        ArrayList<Integer> testList = new ArrayList();

        for (int n = 0; n < 10; n++) {
            testList.add(2 * n);
        }
        for (int i = 0; i < 20; i++) {
            list.add(i);
        }
        System.out.println(list);
        ArrayList result = (exterminator.exterminate(list));
        System.out.println(result);
        Assert.assertEquals(testList, result);
    }

}