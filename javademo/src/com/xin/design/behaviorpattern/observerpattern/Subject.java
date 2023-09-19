package com.xin.design.behaviorpattern.observerpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: 对象
 * @author: puxin
 * @version: 1.0
 * @ClassName: Subject
 * @create: 2023-09-14 16:36
 **/
public class Subject {

    private List<Observer> observers = new ArrayList<>();

    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void notifyAllObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
