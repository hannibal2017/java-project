package com.example.demo.designPattern.observer;

/**
 * @author edz
 * @version V1.0
 * @Package com.example.demo.designPattern.Observer
 * @date 2022-10-14 21:47
 */
public class BinaryObserver extends Observer {

    public BinaryObserver(Subject subject) {
        this.subject = subject;
        subject.add(this);
    }

    @Override
    public void update() {
        System.out.println("Binary String: "
                + Integer.toBinaryString(subject.getState()));
    }
}
