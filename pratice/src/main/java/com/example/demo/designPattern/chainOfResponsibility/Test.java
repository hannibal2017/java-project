package com.example.demo.designPattern.chainOfResponsibility;

/**
 * @author edz
 * @version V1.0
 * @Package com.example.demo.designPattern.chainOfResponsibility
 * @date 2022-10-10 21:12
 */
public class Test {
    public static void main(String[] args) {
        AbstractLogger logger = Test.getLogger();
        logger.logMessage(AbstractLogger.INFO, "info message");
        logger.logMessage(AbstractLogger.DEBUG, "debug message");
        logger.logMessage(AbstractLogger.ERROR, "error message");
    }

    public static AbstractLogger getLogger() {
        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);

        errorLogger.setNextAbstractLogger(fileLogger);
        fileLogger.setNextAbstractLogger(consoleLogger);

        return errorLogger;
    }
}
