package com.example.demo.designPattern.command;

/**
 * @Author luozhenwu
 * @Date 2022/10/12 17:32
 * @Version 1.0
 **/

/**
 * 具体操作对象
 */
public class Stock {

    private String name = "money";

    private Integer quantity = 100;

    public void buy() {
        System.out.println("Stock [ Name: " + name + ", Quantity: " + quantity + " ] bought");
    }

    public void sell() {
        System.out.println("Stock [ Name: " + name + ", Quantity: " + quantity + " ] sold");
    }
}
