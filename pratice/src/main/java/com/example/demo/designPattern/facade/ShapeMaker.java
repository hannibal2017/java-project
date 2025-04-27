package com.example.demo.designPattern.facade;

/**
 * @author edz
 * @version V1.0
 * @Package com.example.demo.designPattern.facade
 * @date 2022-10-07 12:14
 */
public class ShapeMaker {

    private Circle circle;

    private Rectangle rectangle;

    private Square square;

    public ShapeMaker() {
        circle = new Circle();

        rectangle = new Rectangle();

        square = new Square();
    }

    public void drawCircle() {
        circle.draw();
    }

    public void drawRectangle() {
        rectangle.draw();
    }

    public void drawSquare() {
        square.draw();
    }
}
