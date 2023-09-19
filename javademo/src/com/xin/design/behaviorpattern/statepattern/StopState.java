package com.xin.design.behaviorpattern.statepattern;

/**
 * @description:
 * @author: puxin
 * @version: 1.0
 * @ClassName: StopState
 * @create: 2023-09-15 14:41
 **/
public class StopState implements State{
    @Override
    public void doAction(Context context) {
        System.out.println("Player is in stop state");
        context.setState(this);
    }
    public String toString(){
        return "Stop State";
    }
}
