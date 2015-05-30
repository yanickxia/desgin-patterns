package com.desgin.patterns.observer;

/**
 * Created by Yann on 2015/5/29.
 */
public interface Subject {
    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObserver();
}
