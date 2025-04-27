package com.example.demo.designPattern.interpreter;

/**
 * @Author luozhenwu
 * @Date 2022/10/13 11:16
 * @Version 1.0
 **/

/**
 * 解释器模式
 */
public class Test {

    public static Expression getMarriedWoman() {
        TerminalExpression terminalExpression1 = new TerminalExpression("jane");
        TerminalExpression terminalExpression2 = new TerminalExpression("married");

        return new AndExpression(terminalExpression1, terminalExpression2);
    }

    public static void main(String[] args) {
        Expression expression = getMarriedWoman();

        System.out.println("jane is married? = " + expression.interpreter("jane married"));
    }
}
