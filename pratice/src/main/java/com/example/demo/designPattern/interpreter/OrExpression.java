package com.example.demo.designPattern.interpreter;

/**
 * @Author luozhenwu
 * @Date 2022/10/13 11:15
 * @Version 1.0
 **/
public class OrExpression implements Expression {

    private Expression expression1;
    private Expression expression2;

    public OrExpression(Expression expression1, Expression expression2) {
        this.expression1 = expression1;
        this.expression2 = expression2;
    }

    @Override
    public boolean interpreter(String context) {
        return expression1.interpreter(context) || expression2.interpreter(context);
    }
}
