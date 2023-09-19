package com.xin.design.behaviorpattern.interpreterpattern;

/**
 * @description:
 * @author: puxin
 * @version: 1.0
 * @ClassName: AndExpression
 * @create: 2023-09-18 14:56
 **/
public class AndExpression implements Expression {

    private Expression expression1;
    private Expression expression2;

    public AndExpression(Expression expression1, Expression expression2) {
        this.expression1 = expression1;
        this.expression2 = expression2;
    }

    @Override
    public boolean interpret(String content) {
        return expression1.interpret(content) && expression2.interpret(content);
    }
}
