package com.xin.design.behaviorpattern.visitorpattern;

/**
 * @description:
 * @author: puxin
 * @version: 1.0
 * @ClassName: Computer
 * @create: 2023-09-18 15:20
 **/
public class Computer implements ComputerPart {
    ComputerPart[] parts;

    public Computer() {
        this.parts = new ComputerPart[]{new Mouser(), new Keyboard(), new Monitor()};
    }

    @Override
    public void accept(ComputerPartVisitor visitor) {
        for (ComputerPart part : parts) {
            part.accept(visitor);
        }
        visitor.visit(this);
    }
}
