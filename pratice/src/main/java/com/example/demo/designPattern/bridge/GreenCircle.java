package com.example.demo.designPattern.bridge;

/**
 * @Author luozhenwu
 * @Date 2022/10/6 15:35
 * @Version 1.0
 **/
public class GreenCircle implements Draw {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: green, radius: "
                + radius +", x: " +x+", y: "+ y +"]");
    }
}
