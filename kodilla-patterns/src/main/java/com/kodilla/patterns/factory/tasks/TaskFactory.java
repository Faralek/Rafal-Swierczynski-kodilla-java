package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {

    public static final String DrivingTask = "DrivingTask";
    public static final String PaintingTask = "PaintingTask";
    public static final String ShoppingTask = "ShoppingTask";

    public final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case DrivingTask:
                return new DrivingTask("Taxi", "somewhere", "BMW");
            case PaintingTask:
                return new PaintingTask("Paint", "Black", "Red door");
            case ShoppingTask:
                return new ShoppingTask("Make shopping", "Blue Dress", 2);
            default:
                return null;
        }

    }
}
