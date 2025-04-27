package com.example.demo.designPattern.state;

/**
 * @author edz
 * @version V1.0
 * @Package com.example.demo.designPattern.state
 * @date 2022-10-19 22:47
 */
public class Context {

    private State state;

    public Context(){
        state = null;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
