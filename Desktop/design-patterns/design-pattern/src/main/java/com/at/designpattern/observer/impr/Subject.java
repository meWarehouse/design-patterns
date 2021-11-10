package com.at.designpattern.observer.impr;

/**
 * @author zero
 * @create 2020-11-20 19:27
 */
//被观察者
public interface Subject {

    void registerObserver(Observer observer);

    void remove(Observer observer);

    void notifyObserver();

}
