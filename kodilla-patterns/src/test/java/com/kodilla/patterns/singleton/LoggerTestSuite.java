package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoggerTestSuite {
    @BeforeClass
    public static void createLog() {
        Logger.getInstance().log("przedostatni wpis w dzienniku");
        Logger.getInstance().log("ostatni wpis w dzienniku");
    }

    @Test
    public void getLastLog() {
        //Given
        //When
        String lastLog = Logger.getInstance().getLastLog();
        System.out.println(lastLog);
        //Then
        Assert.assertEquals("ostatni wpis w dzienniku",lastLog);
    }
}