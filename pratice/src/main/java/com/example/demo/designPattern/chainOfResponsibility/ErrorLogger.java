package com.example.demo.designPattern.chainOfResponsibility;

/**
 * @author edz
 * @version V1.0
 * @Package com.example.demo.designPattern.chainOfResponsibility
 * @date 2022-10-10 21:10
 */
public class ErrorLogger extends AbstractLogger {

    public ErrorLogger(int level) {
        super(level);
    }

    @Override
    protected void write(String message) {
        System.out.println("Error Console::Logger: " + message);
    }
}
