package com.example.demo.designPattern.decorator;

/**
 * @author edz
 * @version V1.0
 * @Package com.example.demo.designPattern.decorator
 * @date 2022-10-07 11:39
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("circle draw.");
    }
}
