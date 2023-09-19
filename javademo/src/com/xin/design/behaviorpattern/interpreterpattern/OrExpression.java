package com.xin.design.behaviorpattern.interpreterpattern;

/**
 * @description:
 * @author: puxin
 * @version: 1.0
 * @ClassName: OrExpression
 * @create: 2023-09-18 14:54
 **/
public class OrExpression implements Expression{

    private Expression expression1;

    private Expression expression2;

    public OrExpression(Expression expression1, Expression expression2) {
        this.expression1 = expression1;
        this.expression2 = expression2;
    }

    @Override
    public boolean interpret(String content) {
        return expression1.interpret(content) || expression1.interpret(content);
    }

}
