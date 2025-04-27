package com.example.demo.designPattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author edz
 * @version V1.0
 * @Package com.example.demo.designPattern.Observer
 * @date 2022-10-14 21:41
 */
public class Subject {

    private List<Observer> observerList = new ArrayList<>();

    private int state;

    public void setState(int state) {
        this.state = state;
        notifyObservers();
    }

    public int getState() {
        return state;
    }

    public void add(Observer observer) {
        observerList.add(observer);
    }

    public void notifyObservers() {
        for (Observer observer : observerList) {
            observer.update();
        }
    }
}
