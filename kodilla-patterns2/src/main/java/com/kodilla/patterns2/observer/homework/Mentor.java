package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class Mentor implements Observer{
    private final String name;
    private List<TaskQueue> taskQueues;
    private int updateCount;

    @Override
    public void update(TaskQueue taskQueue) {
        System.out.println(taskQueue.getMentee().getName() + " Added new task to: " + taskQueue.getName() + " list");
        updateCount++;
    }

    public Mentor(String name) {
        taskQueues = new ArrayList<>();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<TaskQueue> getTaskQueues() {
        return taskQueues;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
