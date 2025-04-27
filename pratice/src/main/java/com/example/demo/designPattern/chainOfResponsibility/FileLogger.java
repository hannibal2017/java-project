package com.example.demo.designPattern.chainOfResponsibility;

/**
 * @author edz
 * @version V1.0
 * @Package com.example.demo.designPattern.chainOfResponsibility
 * @date 2022-10-10 21:11
 */
public class FileLogger extends AbstractLogger {

    public FileLogger(int level) {
        super(level);
    }

    @Override
    protected void write(String message) {
        System.out.println("File::Logger: " + message);
    }
}
