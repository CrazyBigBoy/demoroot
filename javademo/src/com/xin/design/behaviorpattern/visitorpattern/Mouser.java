package com.xin.design.behaviorpattern.visitorpattern;

/**
 * @description:
 * @author: puxin
 * @version: 1.0
 * @ClassName: Keyboard
 * @create: 2023-09-18 15:17
 **/
public class Mouser implements ComputerPart{
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
