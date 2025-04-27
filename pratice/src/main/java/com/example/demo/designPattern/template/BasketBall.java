package com.example.demo.designPattern.template;

/**
 * @author edz
 * @version V1.0
 * @Package com.example.demo.designPattern.template
 * @date 2022-10-23 23:20
 */
public class BasketBall extends Game {
    @Override
    void init() {
        System.out.println("basketball int");
    }

    @Override
    void start() {
        System.out.println("basketball start");
    }

    @Override
    void end() {
        System.out.println("basketball end");
    }
}
