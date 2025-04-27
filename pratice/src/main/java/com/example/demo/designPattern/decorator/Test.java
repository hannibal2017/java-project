package com.example.demo.designPattern.decorator;

/**
 * @author edz
 * @version V1.0
 * @Package com.example.demo.designPattern.decorator
 * @date 2022-10-07 11:44
 */
public class Test {
    public static void main(String[] args) {

        Shape rectangle = new Rectangle();
        rectangle.draw();

        Shape redShapeDecorator = new RedShapeDecorator(new Circle());
        redShapeDecorator.draw();
    }
}
