package com.example.demo.designPattern.state;

/**
 * @author edz
 * @version V1.0
 * @Package com.example.demo.designPattern.state
 * @date 2022-10-19 22:52
 */
public class Test {
    public static void main(String[] args) {
        Context context = new Context();

        StartState startState = new StartState();
        context.setState(startState);
        String start = context.getState().toString();
        System.out.println(start);

        StopState stopState = new StopState();
        context.setState(stopState);
        String stop = context.getState().toString();
        System.out.println(stop);
    }
}
