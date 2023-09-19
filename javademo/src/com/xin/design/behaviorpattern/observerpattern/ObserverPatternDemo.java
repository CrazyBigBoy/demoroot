package com.xin.design.behaviorpattern.observerpattern;

/**
 * @description: 观察者模版
 * @author: puxin
 * @version: 1.0
 * @ClassName: ObserverPatternDemo
 * @create: 2023-09-14 16:35
 **/
public class ObserverPatternDemo {

    public static void main(String[] args) {
        Subject subject = new Subject();

        new BinaryObserver(subject);
        new OctalObserver(subject);
        new HexaObserver(subject);

        System.out.println("First state change: 15");
        subject.setState(15);
        System.out.println("Second state change: 10");
        subject.setState(10);

    }
}
