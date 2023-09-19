package com.xin.design.behaviorpattern.mementopattern;

/**
 * @description:
 * @author: puxin
 * @version: 1.0
 * @ClassName: Memento
 * @create: 2023-09-15 13:59
 **/
public class Memento {
    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

}
