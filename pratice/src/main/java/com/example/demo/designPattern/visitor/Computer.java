package com.example.demo.designPattern.visitor;

/**
 * @Author luozhenwu
 * @Date 2022/10/24 11:24
 * @Version 1.0
 **/
public class Computer implements ComputerPart {

    ComputerPart[] parts;

    public Computer() {
        parts = new ComputerPart[]{new KeyBoard(), new Monitor(), new Mouse()};
    }

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        for (int i = 0; i < parts.length; i++) {
            parts[i].accept(computerPartVisitor);
        }
        computerPartVisitor.visit(this);
    }
}
