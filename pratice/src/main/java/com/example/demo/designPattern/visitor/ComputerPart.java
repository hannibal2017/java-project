package com.example.demo.designPattern.visitor;

/**
 * @Author luozhenwu
 * @Date 2022/10/24 11:17
 * @Version 1.0
 **/
public interface ComputerPart {

    void accept(ComputerPartVisitor computerPartVisitor);
}
