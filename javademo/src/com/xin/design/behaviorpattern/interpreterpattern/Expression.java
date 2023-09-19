package com.xin.design.behaviorpattern.interpreterpattern;

/**
 * @description:
 * @author: puxin
 * @version: 1.0
 * @ClassName: Expression
 * @create: 2023-09-18 14:52
 **/
public interface Expression {
    public boolean interpret(String content);
}
