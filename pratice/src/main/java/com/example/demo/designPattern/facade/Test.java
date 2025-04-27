package com.example.demo.designPattern.facade;

/**
 * @author edz
 * @version V1.0
 * @Package com.example.demo.designPattern.facade
 * @date 2022-10-07 12:16
 * @Desctiption 外观模式
 */
public class Test {

    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();

        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}
