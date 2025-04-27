package com.example.demo.designPattern.template;

/**
 * @author edz
 * @version V1.0
 * @Package com.example.demo.designPattern.template
 * @date 2022-10-23 23:21
 */
public class FootBall extends Game {
    @Override
    void init() {
        System.out.println("football init");
    }

    @Override
    void start() {
        System.out.println("football start");
    }

    @Override
    void end() {
        System.out.println("football end");
    }
}
