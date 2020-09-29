package com.kodilla.patterns.factory.tasks;

public final class ShoppingTask implements Task{
    final String taskName;
    final String whatToBuy;
    final double quantity;
    private boolean taskCompleted;

    public ShoppingTask(String taskName, String whatToBuy, double quantity){
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
    }

    @Override
    public void executeTask() {
        taskCompleted = true;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        return taskCompleted;
    }
}
