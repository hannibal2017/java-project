package com.example.demo.designPattern.visitor;

/**
 * @Author luozhenwu
 * @Date 2022/10/24 11:30
 * @Version 1.0
 **/
public class ComputerPartVisitorImpl implements ComputerPartVisitor {
    @Override
    public void visit(Computer computer) {
        System.out.println("displaying computer");
    }

    @Override
    public void visit(KeyBoard keyBoard) {
        System.out.println("displaying keyBoard");
    }

    @Override
    public void visit(Monitor monitor) {
        System.out.println("displaying monitor");
    }

    @Override
    public void visit(Mouse mouse) {
        System.out.println("displaying mouse");
    }
}
