package com.xin.design.behaviorpattern.mementopattern;

/**
 * @description:
 * @author: puxin
 * @version: 1.0
 * @ClassName: Originator
 * @create: 2023-09-15 14:02
 **/
public class Originator {
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Memento saveSateTomemto() {
        return new Memento(state);
    }

    public void getStateMemento(Memento memento) {
        state = memento.getState();
    }
}
