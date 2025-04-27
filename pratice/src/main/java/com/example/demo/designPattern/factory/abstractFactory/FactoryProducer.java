package com.example.demo.designPattern.factory.abstractFactory;

import org.springframework.util.StringUtils;

/**
 * @author edz
 * @version V1.0
 * @Package com.example.demo.designPattern.factory.abstractFactory
 * @date 2022-09-29 22:16
 */
public class FactoryProducer {

    public static AbstractFactory getFactory(String factory) {
        if (StringUtils.isEmpty(factory)) {
            return null;
        }

        if (factory.equalsIgnoreCase("shape")) {
            return new ShapeFactory();
        } else if (factory.equalsIgnoreCase("color")) {
            return new ColorFactory();
        }
        return null;
    }
}
