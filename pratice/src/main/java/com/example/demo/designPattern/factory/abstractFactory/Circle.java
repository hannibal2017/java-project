package com.example.demo.designPattern.factory.abstractFactory;


/**
 * @author edz
 * @version V1.0
 * @Package com.example.demo.designPattern.factory.simpleFactory
 * @date 2022-09-29 21:46
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("circle draw");
    }
}
