package com.example.demo.designPattern.decorator;

/**
 * @author edz
 * @version V1.0
 * @Package com.example.demo.designPattern.decorator
 * @date 2022-10-07 11:42
 */
public class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(Shape shape) {
        super(shape);
    }

    @Override
    public void draw() {
        super.draw();
        setBorder();
    }

    private void setBorder() {
        System.out.println("decorator:set red border");
    }
}
