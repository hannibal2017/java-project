package com.example.demo.designPattern.state;

/**
 * @author edz
 * @version V1.0
 * @Package com.example.demo.designPattern.state
 * @date 2022-10-19 22:49
 */
public class StartState implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("start state");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "start";
    }
}
