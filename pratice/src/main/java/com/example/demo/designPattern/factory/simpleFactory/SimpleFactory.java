package com.example.demo.designPattern.factory.simpleFactory;

import org.springframework.util.StringUtils;

/**
 * @author edz
 * @version V1.0
 * @Package com.example.demo.designPattern.factory.simpleFactory
 * @date 2022-09-29 21:48
 */
public class SimpleFactory {

    public static Shape getShape(String type) {
        if (StringUtils.isEmpty(type)) {
            return null;
        }

        if (type.equalsIgnoreCase("circle")) {
            return new Circle();
        } else if (type.equalsIgnoreCase("rectangle")) {
            return new Rectangle();
        } else if (type.equalsIgnoreCase("square")) {
            return new Square();
        }
        return null;
    }
}
