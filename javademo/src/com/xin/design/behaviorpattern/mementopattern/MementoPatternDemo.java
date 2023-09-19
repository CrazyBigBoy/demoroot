package com.xin.design.behaviorpattern.mementopattern;

/**
 * @description:
 * @author: puxin
 * @version: 1.0
 * @ClassName: MementoPatternDemo
 * @create: 2023-09-15 13:59
 **/
public class MementoPatternDemo {
    public static void main(String[] args) {
        Originator originator = new Originator();
        CateTaker cateTaker = new CateTaker();

        for (int i = 0; i < 5; i++) {
            originator.setState("State #" + i);
            cateTaker.add(originator.saveSateTomemto());
        }
        //originator.setState("State #1");
        //cateTaker.add(originator.saveSateTomemto());
        //
        //originator.setState("State #2");
        //cateTaker.add(originator.saveSateTomemto());
        //
        //originator.setState("State #3");
        //cateTaker.add(originator.saveSateTomemto());
        //
        //originator.setState("State #4");
        System.out.println(originator.getState());
        System.out.println("================");

        for (int i = 0; i < 5; i++) {
            originator.getStateMemento(cateTaker.get(i));
            System.out.println(originator.getState());
        }
        //originator.getStateMemento(cateTaker.get(0));
        //System.out.println(originator.getState());
        //originator.getStateMemento(cateTaker.get(1));
        //System.out.println(originator.getState());
        //originator.getStateMemento(cateTaker.get(2));
        //System.out.println(originator.getState());

    }
}
