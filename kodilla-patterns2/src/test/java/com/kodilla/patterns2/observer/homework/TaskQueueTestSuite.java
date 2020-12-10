package com.kodilla.patterns2.observer.homework;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TaskQueueTestSuite {
    @Test
    public void testTaskQueueNotifications() {
        //Given
        Mentor pawel = new Mentor("Paweł");
        Mentor wiesio = new Mentor("Wiesław");

        Mentee atos = new Mentee("Atos");
        Mentee portos = new Mentee("Portos");
        Mentee aramis = new Mentee("Aramis");

        TaskQueue atosTasks = new TaskQueue("atosTasks", atos);
        atosTasks.registerObserverMentee(atos);
        TaskQueue portosTasks = new TaskQueue("portosTasks", portos);
        portosTasks.registerObserverMentee(portos);
        TaskQueue aramisTasks = new TaskQueue("aramisTasks", aramis);
        aramisTasks.registerObserverMentee(aramis);

        pawel.getTaskQueues().add(atosTasks);
        atosTasks.registerObserverMentor(pawel);
        pawel.getTaskQueues().add(portosTasks);
        portosTasks.registerObserverMentor(pawel);
        wiesio.getTaskQueues().add(aramisTasks);
        aramisTasks.registerObserverMentor(wiesio);

        Task task1 = new Task("task1");
        Task task2 = new Task("task2");
        Task task3 = new Task("task3");
        Task task4 = new Task("task4");

        aramisTasks.addTask(task1);
        aramisTasks.addTask(task2);
        aramisTasks.acceptTask(task1);

        portosTasks.addTask(task2);
        portosTasks.addTask(task3);
        portosTasks.acceptTask(task3);

        atosTasks.addTask(task1);
        atosTasks.addTask(task4);

        assertEquals(4,pawel.getUpdateCount());
        assertEquals(2,wiesio.getUpdateCount());
        assertEquals(1,aramis.getUpdateCount());
        assertEquals(1,portos.getUpdateCount());
    }
}

