package com.kodilla.patterns2.observer.homework;

public interface Observable {
    void registerObserverMentor(Observer observer);
    void registerObserverMentee(Observer observer);
    void notifyObserversMentors();
    void notifyObserversMentees();
    void removeObserver(Observer observer);
}
