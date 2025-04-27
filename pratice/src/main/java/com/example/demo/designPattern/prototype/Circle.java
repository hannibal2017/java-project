package com.example.demo.designPattern.prototype;

/**
 * @author edz
 * @version V1.0
 * @Package com.example.demo.designPattern.prototype
 * @date 2022-09-29 20:19
 */
public class Circle extends Shape {

    public Circle() {
        type = "Circle";
    }

    @Override
    void draw() {
        System.out.println("Circle draw");
    }
}
