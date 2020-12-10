package com.kodilla.patterns2.observer.homework;

public class Mentee implements Observer {
    private final String name;
    private int updateCount;

    @Override
    public void update(TaskQueue taskQueue) {
        System.out.println("Task from: " + taskQueue.getName() + " was accepted");
        updateCount++;
    }

    public Mentee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
