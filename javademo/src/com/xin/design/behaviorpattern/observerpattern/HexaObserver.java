package com.xin.design.behaviorpattern.observerpattern;

/**
 * @description:
 * @author: puxin
 * @version: 1.0
 * @ClassName: HexaObserver
 * @create: 2023-09-14 17:03
 **/
public class HexaObserver extends Observer {
    public HexaObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Hexa String: " + Integer.toHexString(subject.getState()));
    }
}
