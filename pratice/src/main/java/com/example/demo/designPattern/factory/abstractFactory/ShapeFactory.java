package com.example.demo.designPattern.factory.abstractFactory;

import org.springframework.util.StringUtils;

/**
 * @author edz
 * @version V1.0
 * @Package com.example.demo.designPattern.factory.abstractFactory
 * @date 2022-09-29 22:04
 */
public class ShapeFactory extends AbstractFactory {
    @Override
    public Shape getShape(String shape) {
        if (StringUtils.isEmpty(shape)) {
            return null;
        }

        if (shape.equalsIgnoreCase("circle")) {
            return new Circle();
        } else if (shape.equalsIgnoreCase("rectangle")) {
            return new Rectangle();
        } else if (shape.equalsIgnoreCase("square")) {
            return new Square();
        }
        return null;
    }

    @Override
    public Color getColor(String color) {
        return null;
    }
}
