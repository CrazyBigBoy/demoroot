package com.xin.design.behaviorpattern.mediatorpattern;

/**
 * @description:
 * @author: puxin
 * @version: 1.0
 * @ClassName: MediatorPatternDemo
 * @create: 2023-09-15 14:52
 **/
public class MediatorPatternDemo {
    public static void main(String[] args) {
        User tom = new User("Tom");
        User jack = new User("Jack");

        tom.sendMessage("My name is " + tom.getName() + "!");
        jack.sendMessage("My name is " + jack.getName() + "!");
    }
}
