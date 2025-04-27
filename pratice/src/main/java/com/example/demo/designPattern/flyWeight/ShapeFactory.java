package com.example.demo.designPattern.flyWeight;

import java.util.HashMap;

/**
 * @author edz
 * @version V1.0
 * @Package com.example.demo.designPattern.flyWeight
 * @date 2022-10-07 23:41
 */
public class ShapeFactory {

    private static final HashMap<String, Shape> shapeMap = new HashMap();

    public static Shape getShape(String color) {

        Circle circle = (Circle) shapeMap.get(color);

        if (circle == null) {
            Circle circle1 = new Circle(color);
            System.out.println("make shape,the color: " + color);
            shapeMap.put(color, circle1);
            return circle1;
        }
        return circle;
    }
}
