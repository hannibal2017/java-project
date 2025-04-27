package com.example.demo.designPattern.bridge;

/**
 * @Author luozhenwu
 * @Date 2022/10/6 15:36
 * @Version 1.0
 **/
public abstract class Shape {
    Draw draw;

    protected Shape(Draw draw){
        this.draw = draw;
    }

    abstract void draw();

}
