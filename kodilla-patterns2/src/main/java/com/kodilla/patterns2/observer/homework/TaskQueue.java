package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class TaskQueue implements Observable{
    private final List<Observer> observingMentors;
    private final List<Observer> observingMentees;
    private final String name;
    private final Mentee mentee;
    private List<Task> taskList;

    public TaskQueue(String name, Mentee mentee){
        this.name = name;
        this.mentee = mentee;
        taskList = new ArrayList<>();
        observingMentees = new ArrayList<>();
        observingMentors = new ArrayList<>();
    }

    public void addTask(Task task) {
        taskList.add(task);
        notifyObserversMentors();
    }

    public void acceptTask(Task task) {
        taskList.remove(task);
        notifyObserversMentees();
    }

    @Override
    public void registerObserverMentor(Observer observer) {
        observingMentors.add(observer);
    }

    @Override
    public void registerObserverMentee(Observer observer) {
        observingMentees.add(observer);
    }

    @Override
    public void notifyObserversMentors() {
        for(Observer observer: observingMentors){
            observer.update(this);
        }
    }

    @Override
    public void notifyObserversMentees() {
        for(Observer observer: observingMentees){
            observer.update(this);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        observingMentees.remove(observer);
        observingMentors.remove(observer);
    }

    public String getName() {
        return name;
    }

    public Mentee getMentee() {
        return mentee;
    }

    public List<Task> getQueue() {
        return taskList;
    }
}
