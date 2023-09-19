package com.xin.design.behaviorpattern.chainpattern;

/**
 * @description: 日志抽象类
 * @author: puxin
 * @version: 1.0
 * @ClassName: AbstractLogger
 * @create: 2023-09-15 11:00
 **/
public abstract class AbstractLogger {
    public static final int INFO = 1;
    public static final int DEBUG = 2;
    public static final int ERROR = 3;

    protected int level;

    protected AbstractLogger nextLogger;

    public void setNextLogger(AbstractLogger nextLogger) {
        this.nextLogger = nextLogger;
    }

    public void logMessage(int level, String message) {
        if (this.level <= level) {
            write(message);
        }
        if (nextLogger != null) {
            nextLogger.logMessage(level, message);
        }
    }

    abstract protected void write(String message);
}
