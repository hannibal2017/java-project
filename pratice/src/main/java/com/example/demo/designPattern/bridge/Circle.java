package com.example.demo.designPattern.bridge;

/**
 * @Author luozhenwu
 * @Date 2022/10/6 15:38
 * @Version 1.0
 **/
public class Circle extends Shape {
    private int radius,x,y;

    public Circle(int radius,int x, int y,Draw draw){
        super(draw);
        this.radius = radius;
        this.x = x;
        this.y = y;
    }

    @Override
    void draw() {
        draw.drawCircle(radius,x,y);
    }
}
