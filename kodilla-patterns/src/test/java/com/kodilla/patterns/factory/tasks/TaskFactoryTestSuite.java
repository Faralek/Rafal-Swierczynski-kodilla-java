package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

import java.util.Objects;

public class TaskFactoryTestSuite {
    @Test
    public void testFactoryShopping() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task shopping = taskFactory.makeTask(TaskFactory.ShoppingTask);
        //Then
        Assert.assertEquals("Make shopping", Objects.requireNonNull(shopping).getTaskName());
        Assert.assertFalse(shopping.isTaskExecuted());
        shopping.executeTask();
        Assert.assertTrue(shopping.isTaskExecuted());
    }

    @Test
    public void TestFactoryDriving() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task driving = taskFactory.makeTask(TaskFactory.DrivingTask);
        //Then
        Assert.assertEquals("Taxi", Objects.requireNonNull(driving).getTaskName());
        Assert.assertFalse(driving.isTaskExecuted());
        driving.executeTask();
        Assert.assertTrue(driving.isTaskExecuted());
    }

    @Test
    public void TestFactoryPainting() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task paint = taskFactory.makeTask(TaskFactory.PaintingTask);
        //Then
        Assert.assertEquals("Paint", Objects.requireNonNull(paint).getTaskName());
        Assert.assertFalse(paint.isTaskExecuted());
        paint.executeTask();
        Assert.assertTrue(paint.isTaskExecuted());
    }
}