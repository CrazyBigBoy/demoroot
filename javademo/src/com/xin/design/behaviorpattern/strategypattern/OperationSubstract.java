package com.xin.design.behaviorpattern.strategypattern;

/**
 * @description: 减法操作
 * @author: puxin
 * @version: 1.0
 * @ClassName: OperationSubstract
 * @create: 2023-09-14 14:52
 **/
public class OperationSubstract implements Strategy{
    @Override
    public int doOperation(int a, int b) {
        return a - b;
    }
}
