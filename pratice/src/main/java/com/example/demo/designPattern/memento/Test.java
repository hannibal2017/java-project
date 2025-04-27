package com.example.demo.designPattern.memento;

/**
 * @author edz
 * @version V1.0
 * @Package com.example.demo.designPattern.memento
 * @date 2022-10-13 20:16
 * @description 备忘录模式
 */
public class Test {
    public static void main(String[] args) {
        Originator originator = new Originator();

        originator.setState("state1");

        CareMaker careMaker = new CareMaker();
        careMaker.add(originator.saveToMemento());

        originator.setState("state2");
        careMaker.add(originator.saveToMemento());
        originator.setState("state3");
        careMaker.add(originator.saveToMemento());

        Memento memento1 = careMaker.get(0);
        originator.getFromMemento(memento1);
        System.out.println(originator.getState());

        Memento memento2 = careMaker.get(1);
        originator.getFromMemento(memento2);
        System.out.println(originator.getState());

        Memento memento3 = careMaker.get(2);
        originator.getFromMemento(memento3);
        System.out.println(originator.getState());


    }
}
