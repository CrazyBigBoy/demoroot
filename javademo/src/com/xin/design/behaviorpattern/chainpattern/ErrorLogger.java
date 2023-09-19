package com.xin.design.behaviorpattern.chainpattern;

/**
 * @description:
 * @author: puxin
 * @version: 1.0
 * @ClassName: ConsoleLogger
 * @create: 2023-09-15 11:05
 **/
public class ErrorLogger extends AbstractLogger{
    public ErrorLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Error Console::Logger: " + message);
    }
}
