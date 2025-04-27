package com.example.demo.designPattern.factory.simpleFactory;

/**
 * @author edz
 * @version V1.0
 * @Package com.example.demo.designPattern.factory.simpleFactory
 * @date 2022-09-29 21:54
 */
public class Test {
    public static void main(String[] args) {
        Shape circle = SimpleFactory.getShape("circle");
        circle.draw();

        Shape rectangle = SimpleFactory.getShape("rectangle");
        rectangle.draw();

        Shape square = SimpleFactory.getShape("square");
        square.draw();
    }
}
