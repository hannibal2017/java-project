package com.example.demo.designPattern.template;

/**
 * @author edz
 * @version V1.0
 * @Package com.example.demo.designPattern.template
 * @date 2022-10-23 23:22
 */
public class Test {
    public static void main(String[] args) {
        Game game = new BasketBall();
        game.play();

        game = new FootBall();
        game.play();
    }
}
