package com.xin.design.behaviorpattern.observerpattern;

/**
 * @description:
 * @author: puxin
 * @version: 1.0
 * @ClassName: BinaryObserver
 * @create: 2023-09-14 16:59
 **/
public class BinaryObserver extends Observer{

    public BinaryObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Binary String: " + Integer.toBinaryString(subject.getState()));
    }
}
