package com.example.demo.designPattern.interpreter;

/**
 * @Author luozhenwu
 * @Date 2022/10/13 11:08
 * @Version 1.0
 **/
public class TerminalExpression implements Expression {

    private String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean interpreter(String context) {
        if(context.contains(data)){
            return true;
        }
        return false;
    }
}
