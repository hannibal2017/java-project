package com.example.demo.designPattern.template;

/**
 * @author edz
 * @version V1.0
 * @Package com.example.demo.designPattern.template
 * @date 2022-10-23 23:18
 */
public abstract class Game {

    abstract void init();

    abstract void start();

    abstract void end();

    public final void play() {
        init();

        start();

        end();
    }
}
