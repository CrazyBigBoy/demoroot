package com.xin.design.behaviorpattern.visitorpattern;

/**
 * @description:
 * @author: puxin
 * @version: 1.0
 * @ClassName: ComputerPartDisplayVisitor
 * @create: 2023-09-18 15:21
 **/
public class ComputerPartDisplayVisitor implements ComputerPartVisitor{
    @Override
    public void visit(Keyboard keyboard) {
        System.out.println("Display Keyboard.");
    }

    @Override
    public void visit(Mouser keyboard) {
        System.out.println("Display Mouser.");

    }

    @Override
    public void visit(Monitor monitor) {
        System.out.println("Display Monitor.");

    }

    @Override
    public void visit(Computer computer) {
        System.out.println("Display Computer.");

    }
}
