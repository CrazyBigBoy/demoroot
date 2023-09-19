package com.xin.design.behaviorpattern.strategypattern;

/**
 * @description: 策略使用类
 * @author: puxin
 * @version: 1.0
 * @ClassName: Context
 * @create: 2023-09-14 14:53
 **/
public class Context {

    private Strategy strategy;


    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public int executeStrate(int a, int b) {
        return strategy.doOperation(a, b);
    }
}
