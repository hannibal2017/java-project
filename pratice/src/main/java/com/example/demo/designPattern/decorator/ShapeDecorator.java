package com.example.demo.designPattern.decorator;

/**
 * @author edz
 * @version V1.0
 * @Package com.example.demo.designPattern.decorator
 * @date 2022-10-07 11:40
 */
public abstract class ShapeDecorator implements Shape {

    protected Shape shapeDecotator;

    public ShapeDecorator(Shape shape) {
        this.shapeDecotator = shape;
    }

    @Override
    public void draw() {
        shapeDecotator.draw();
    }
}
