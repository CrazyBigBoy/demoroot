package com.xin.design.behaviorpattern.visitorpattern;

/**
 * @description:
 * @author: puxin
 * @version: 1.0
 * @ClassName: VisitorPatternDemo
 * @create: 2023-09-18 15:15
 **/
public class VisitorPatternDemo {
    public static void main(String[] args) {
        //Computer computer = new Computer();
        //computer.accept(new ComputerPartDisplayVisitor());

        Mouser mouser = new Mouser();
        mouser.accept(new ComputerPartDisplayVisitor());
    }
}
