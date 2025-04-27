package com.example.demo.designPattern.visitor;

/**
 * @Author luozhenwu
 * @Date 2022/10/24 11:31
 * @Version 1.0
 * @description 访问者模式
 **/
public class Test {
    public static void main(String[] args) {
        ComputerPart computerPart = new Computer();

        computerPart.accept(new ComputerPartVisitorImpl());
    }
}
