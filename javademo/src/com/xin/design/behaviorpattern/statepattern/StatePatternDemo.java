package com.xin.design.behaviorpattern.statepattern;

/**
 * @description:
 * @author: puxin
 * @version: 1.0
 * @ClassName: StatePatternDemo
 * @create: 2023-09-15 14:39
 **/
public class StatePatternDemo {

    public static void main(String[] args) {
        Context context = new Context();

        StartState startState = new StartState();
        startState.doAction(context);

        StopState stopState = new StopState();
        stopState.doAction(context);
    }
}
