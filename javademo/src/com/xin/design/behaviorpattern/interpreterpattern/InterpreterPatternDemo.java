package com.xin.design.behaviorpattern.interpreterpattern;

/**
 * @description:
 * @author: puxin
 * @version: 1.0
 * @ClassName: InterpreterPatternDemo
 * @create: 2023-09-18 14:52
 **/
public class InterpreterPatternDemo {

    public static Expression getMaleExpression() {
        Expression tom = new TerminalExpression("Tom");
        Expression jone = new TerminalExpression("Jone");
        return new OrExpression(tom, jone);
    }

    public static Expression getMarriedWomanExpression(){
        Expression jack = new TerminalExpression("Jack");
        Expression married = new TerminalExpression("Married");
        return new AndExpression(jack, married);
    }

    public static void main(String[] args) {
        //Expression maleExpression = getMaleExpression();
        Expression marriedWomanExpression = getMarriedWomanExpression();
        //System.out.println(maleExpression.interpret("Jone"));
        //System.out.println(maleExpression.interpret("Tom"));
        //System.out.println(maleExpression.interpret("Jack"));
        //System.out.println(maleExpression.interpret("Tom Jone"));
        System.out.println(marriedWomanExpression.interpret("Married Jack1"));
        System.out.println(marriedWomanExpression.interpret("Married Jac"));
    }
}
