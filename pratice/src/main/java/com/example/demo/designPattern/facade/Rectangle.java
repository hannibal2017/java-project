package com.example.demo.designPattern.facade;

/**
 * @author edz
 * @version V1.0
 * @Package com.example.demo.designPattern.facade
 * @date 2022-10-07 11:39
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("rectangle draw.");
    }
}
