package com.example.demo.designPattern.visitor;

/**
 * @Author luozhenwu
 * @Date 2022/10/24 11:17
 * @Version 1.0
 **/
public interface ComputerPartVisitor {

    void visit(Computer computer);

    void visit(KeyBoard keyBoard);

    void visit(Monitor monitor);

    void visit(Mouse mouse);
}
