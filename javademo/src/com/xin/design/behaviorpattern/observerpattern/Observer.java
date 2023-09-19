package com.xin.design.behaviorpattern.observerpattern;

/**
 * @description: 观察抽象类
 * @author: puxin
 * @version: 1.0
 * @ClassName: Observer
 * @create: 2023-09-14 16:36
 **/
public abstract class Observer {
    protected Subject subject;

    public abstract void update();
}
