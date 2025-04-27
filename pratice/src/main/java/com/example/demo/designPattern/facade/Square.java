package com.example.demo.designPattern.facade;

/**
 * @author edz
 * @version V1.0
 * @Package com.example.demo.designPattern.facade
 * @date 2022-10-07 12:13
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("square draw.");
    }
}
