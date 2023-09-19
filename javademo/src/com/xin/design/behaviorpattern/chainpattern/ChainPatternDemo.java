package com.xin.design.behaviorpattern.chainpattern;

/**
 * @description:
 * @author: puxin
 * @version: 1.0
 * @ClassName: ChainPatternDemo
 * @create: 2023-09-15 10:59
 **/
public class ChainPatternDemo {

    private static  AbstractLogger getChainOfLoggers() {
        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger concoleLogger = new ConsoleLogger(AbstractLogger.INFO);

        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(concoleLogger);

        return errorLogger;
    }
    public static void main(String[] args) {
        AbstractLogger chainOfLoggers = getChainOfLoggers();
        chainOfLoggers.logMessage(AbstractLogger.INFO, "This is an information.");

        System.out.println("============================");
        chainOfLoggers.logMessage(AbstractLogger.DEBUG, "This is a debug level infomation.");

        System.out.println("============================");
        chainOfLoggers.logMessage(AbstractLogger.ERROR, "This is an error information.");
    }
}
