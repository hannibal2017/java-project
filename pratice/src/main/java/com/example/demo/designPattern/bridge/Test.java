package com.example.demo.designPattern.bridge;

/**
 * @Author luozhenwu
 * @Date 2022/10/6 15:41
 * @Version 1.0
 **/
public class Test {
    public static void main(String[] args) {
        Circle redCircle = new Circle(3, 4, 5, new RedCircle());
        redCircle.draw();

        Circle greenCircle = new Circle(4, 5, 6, new GreenCircle());
        greenCircle.draw();
    }
}
