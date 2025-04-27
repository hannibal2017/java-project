package com.example.demo.designPattern.prototype;

/**
 * @author edz
 * @version V1.0
 * @Package com.example.demo.designPattern.prototype
 * @date 2022-09-29 20:21
 */
public class Square extends Shape {

    public Square(){
        type = "square";
    }
    @Override
    void draw() {
        System.out.println("Square draw");
    }
}
