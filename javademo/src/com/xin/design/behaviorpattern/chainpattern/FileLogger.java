package com.xin.design.behaviorpattern.chainpattern;

/**
 * @description:
 * @author: puxin
 * @version: 1.0
 * @ClassName: ConsoleLogger
 * @create: 2023-09-15 11:05
 **/
public class FileLogger extends AbstractLogger{
    public FileLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("File Console::Logger: " + message);
    }
}
