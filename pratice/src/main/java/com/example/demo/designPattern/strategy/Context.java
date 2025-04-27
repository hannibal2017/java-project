package com.example.demo.designPattern.strategy;

/**
 * @author edz
 * @version V1.0
 * @Package com.example.demo.designPattern.strategy
 * @date 2022-10-23 23:04
 */
public class Context {

    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void execute(int num1, int num2) {
        strategy.operation(num1, num2);
    }
}
