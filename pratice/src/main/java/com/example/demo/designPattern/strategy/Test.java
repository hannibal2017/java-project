package com.example.demo.designPattern.strategy;

/**
 * @author edz
 * @version V1.0
 * @Package com.example.demo.designPattern.strategy
 * @date 2022-10-23 23:06
 * @description 策略模式
 */
public class Test {
    public static void main(String[] args) {
        Context context = new Context(new Add());

        context.execute(5, 9);

        context = new Context(new Subtract());
        context.execute(3, 9);

        context = new Context(new Multify());
        context.execute(32, 2);
    }
}
