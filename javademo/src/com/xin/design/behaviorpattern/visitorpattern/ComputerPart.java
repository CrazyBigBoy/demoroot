package com.xin.design.behaviorpattern.visitorpattern;

/**
 * @description:
 * @author: puxin
 * @version: 1.0
 * @ClassName: ComputerPart
 * @create: 2023-09-18 15:16
 **/
public interface ComputerPart {
    public void accept(ComputerPartVisitor visitor);
}
