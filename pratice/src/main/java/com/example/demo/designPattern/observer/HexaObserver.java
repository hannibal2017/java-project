package com.example.demo.designPattern.observer;

/**
 * @author edz
 * @version V1.0
 * @Package com.example.demo.designPattern.Observer
 * @date 2022-10-14 21:56
 */
public class HexaObserver extends Observer {

    public HexaObserver(Subject subject) {
        this.subject = subject;
        subject.add(this);
    }

    @Override
    public void update() {
        System.out.println("Hex String: "
                + Integer.toHexString(subject.getState()).toUpperCase());
    }
}
