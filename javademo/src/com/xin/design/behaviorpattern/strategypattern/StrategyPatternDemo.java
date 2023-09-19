package com.xin.design.behaviorpattern.strategypattern;

/**
 * @description:
 * @author: puxin
 * @version: 1.0
 * @ClassName: StrategyPatternDemo
 * @create: 2023-09-14 14:55
 **/
public class StrategyPatternDemo {
    public static void main(String[] args) {
        Context context = new Context(new OperationAdd());
        System.out.println(context.executeStrate(5, 6));

        context = new Context(new OperationSubstract());
        System.out.println(context.executeStrate(5, 3));

        context = new Context(new OperationMultiply());
        System.out.println(context.executeStrate(2, 3));
    }
}
