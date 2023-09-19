package com.xin.design.behaviorpattern.strategypattern;

/**
 * @description: 乘法操作实现类
 * @author: puxin
 * @version: 1.0
 * @ClassName: OperationMultiply
 * @create: 2023-09-14 14:53
 **/
public class OperationMultiply implements Strategy{
    @Override
    public int doOperation(int a, int b) {
        return a * b;
    }
}
