package com.xin.design.behaviorpattern.interpreterpattern;

/**
 * @description:
 * @author: puxin
 * @version: 1.0
 * @ClassName: TerminalExpression
 * @create: 2023-09-18 14:53
 **/
public class TerminalExpression implements Expression{

    private String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean interpret(String content) {
        return content.contains(data);
    }
}
