package com.xin.design.behaviorpattern.strategypattern;

/**
 * @description: 加法操作
 * @author: puxin
 * @version: 1.0
 * @ClassName: OperationAdd
 * @create: 2023-09-14 14:51
 **/
public class OperationAdd implements Strategy{

    @Override
    public int doOperation(int a, int b) {
        return a + b;
    }
}
