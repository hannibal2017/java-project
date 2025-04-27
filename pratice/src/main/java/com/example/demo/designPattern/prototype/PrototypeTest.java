package com.example.demo.designPattern.prototype;

import com.alibaba.fastjson.JSON;

/**
 * @author edz
 * @version V1.0
 * @Package com.example.demo.designPattern.prototype
 * @date 2022-09-29 20:32
 */
public class PrototypeTest {
    public static void main(String[] args) {
        ShapeCache.loadCache();

        Shape circle = ShapeCache.getShape("1");
        System.out.println("circle:" + JSON.toJSONString(circle));
        circle.draw();

        Shape rectangle = ShapeCache.getShape("2");
        System.out.println("rectangle:" + JSON.toJSONString(rectangle));
        rectangle.draw();

        Shape square = ShapeCache.getShape("3");
        System.out.println("square:" + JSON.toJSONString(square));
        square.draw();
    }
}
