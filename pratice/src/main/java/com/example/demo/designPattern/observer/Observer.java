package com.example.demo.designPattern.observer;

/**
 * @author edz
 * @version V1.0
 * @Package com.example.demo.designPattern.Observer
 * @date 2022-10-14 21:41
 */
public abstract class Observer {

    protected Subject subject;

    public abstract void update();
}
