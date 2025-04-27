package com.example.demo.designPattern.prototype;

/**
 * @author edz
 * @version V1.0
 * @Package com.example.demo.designPattern.prototype
 * @date 2022-09-29 20:22
 */
public class Rectangle extends Shape {

    public Rectangle() {

        type = "rectangle";
    }

    @Override
    void draw() {
        System.out.println("Rectangle draw");
    }
}
