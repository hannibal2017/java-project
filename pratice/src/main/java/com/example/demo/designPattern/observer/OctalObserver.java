package com.example.demo.designPattern.observer;

/**
 * @author edz
 * @version V1.0
 * @Package com.example.demo.designPattern.Observer
 * @date 2022-10-14 21:54
 */
public class OctalObserver extends Observer {

    public OctalObserver(Subject subject) {
        this.subject = subject;
        subject.add(this);
    }

    @Override
    public void update() {
        System.out.println( "Octal String: "
                + Integer.toOctalString( subject.getState() ) );
    }
}
