package com.xin.design.behaviorpattern.observerpattern;

/**
 * @description:
 * @author: puxin
 * @version: 1.0
 * @ClassName: OctalObserver
 * @create: 2023-09-14 17:02
 **/
public class OctalObserver extends Observer {

    public OctalObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Octal String: " + Integer.toOctalString(subject.getState()));
    }
}
