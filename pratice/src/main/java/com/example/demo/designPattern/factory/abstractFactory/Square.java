package com.example.demo.designPattern.factory.abstractFactory;


/**
 * @author edz
 * @version V1.0
 * @Package com.example.demo.designPattern.factory.simpleFactory
 * @date 2022-09-29 21:47
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("square draw");
    }
}
