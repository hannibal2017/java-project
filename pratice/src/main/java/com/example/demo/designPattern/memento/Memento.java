package com.example.demo.designPattern.memento;

/**
 * @author edz
 * @version V1.0
 * @Package com.example.demo.designPattern.memento
 * @date 2022-10-13 20:09
 */
public class Memento {

    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
