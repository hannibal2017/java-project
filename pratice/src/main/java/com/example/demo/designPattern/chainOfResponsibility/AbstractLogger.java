package com.example.demo.designPattern.chainOfResponsibility;

/**
 * @author edz
 * @version V1.0
 * @Package com.example.demo.designPattern.chainOfResponsibility
 * @date 2022-10-10 21:01
 */
public abstract class AbstractLogger {

    public static final int INFO = 1;
    public static final int DEBUG = 2;
    public static final int ERROR = 3;

    protected int level;

    public AbstractLogger(int level) {
        this.level = level;
    }

    public AbstractLogger nextAbstractLogger;

    public void setNextAbstractLogger(AbstractLogger abstractLogger) {
        this.nextAbstractLogger = abstractLogger;
    }


    public void logMessage(int level, String message) {
        if (this.level <= level) {
            write(message);
        }
        if (nextAbstractLogger != null) {
            nextAbstractLogger.logMessage(level, message);
        }
    }

    protected abstract void write(String message);


}
