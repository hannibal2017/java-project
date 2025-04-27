package com.example.demo.designPattern.factory.abstractFactory;

/**
 * @author edz
 * @version V1.0
 * @Package com.example.demo.designPattern.factory.abstractFactory
 * @date 2022-09-29 21:59
 */
public abstract class AbstractFactory {

    public abstract Shape getShape(String shape);

    public abstract Color getColor(String color);
}
