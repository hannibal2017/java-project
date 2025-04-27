package com.example.demo.designPattern.strategy;

/**
 * @author edz
 * @version V1.0
 * @Package com.example.demo.designPattern.strategy
 * @date 2022-10-23 23:03
 */
public class Subtract implements Strategy {
    @Override
    public void operation(int num1, int num2) {
        int result = num1 - num2;
        System.out.println("subtract: " + result);
    }
}
