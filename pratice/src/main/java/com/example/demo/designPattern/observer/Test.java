package com.example.demo.designPattern.observer;

/**
 * @author edz
 * @version V1.0
 * @Package com.example.demo.designPattern.Observer
 * @date 2022-10-14 21:57
 */
public class Test {
    public static void main(String[] args) {
        Subject subject = new Subject();

        BinaryObserver binaryObserver = new BinaryObserver(subject);
        OctalObserver octalObserver = new OctalObserver(subject);
        HexaObserver hexaObserver = new HexaObserver(subject);

        System.out.println("first state:");
        subject.setState(12);

        System.out.println("second state:");
        subject.setState(22);
    }
}
