package com.xin.design.behaviorpattern.visitorpattern;

/**
 * @description:
 * @author: puxin
 * @version: 1.0
 * @ClassName: ComputerPartVisitor
 * @create: 2023-09-18 15:17
 **/
public interface ComputerPartVisitor {
    void visit(Keyboard keyboard);

    void visit(Mouser keyboard);

    void visit(Monitor monitor);

    void visit(Computer computer);
}
