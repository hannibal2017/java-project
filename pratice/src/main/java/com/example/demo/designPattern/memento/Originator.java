package com.example.demo.designPattern.memento;

/**
 * @author edz
 * @version V1.0
 * @Package com.example.demo.designPattern.memento
 * @date 2022-10-13 20:10
 */
public class Originator {

    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Memento saveToMemento() {
        return new Memento(state);
    }

    public void getFromMemento(Memento memento) {
        state = memento.getState();
    }
}
