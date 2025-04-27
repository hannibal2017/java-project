package com.example.demo.designPattern.factory.abstractFactory;

/**
 * @author edz
 * @version V1.0
 * @Package com.example.demo.designPattern.factory.abstractFactory
 * @date 2022-09-29 22:19
 */
public class Test {
    public static void main(String[] args) {
        AbstractFactory shapeFactory = FactoryProducer.getFactory("shape");

        Shape circle = shapeFactory.getShape("circle");
        circle.draw();

        Shape rectangle = shapeFactory.getShape("rectangle");
        rectangle.draw();

        Shape square = shapeFactory.getShape("square");
        square.draw();

        AbstractFactory colorFactory = FactoryProducer.getFactory("color");

        Color red = colorFactory.getColor("red");
        red.color();

        Color white = colorFactory.getColor("white");
        white.color();
    }
}
