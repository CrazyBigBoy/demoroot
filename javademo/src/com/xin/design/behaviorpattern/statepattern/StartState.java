package com.xin.design.behaviorpattern.statepattern;

/**
 * @description:
 * @author: puxin
 * @version: 1.0
 * @ClassName: StartState
 * @create: 2023-09-15 14:41
 **/
public class StartState implements State{
    @Override
    public void doAction(Context context) {
        System.out.println("Player is in start  state");
        context.setState(this);
    }
    public String toString(){
        return "start  State";
    }
}
