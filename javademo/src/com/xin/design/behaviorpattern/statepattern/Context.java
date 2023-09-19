package com.xin.design.behaviorpattern.statepattern;

/**
 * @description:
 * @author: puxin
 * @version: 1.0
 * @ClassName: Context
 * @create: 2023-09-15 14:40
 **/
public class Context {
    private State state;

    public Context() {
        this.state = null;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
