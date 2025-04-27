package com.example.demo.designPattern.builder;

/**
 * @author edz
 * @version V1.0
 * @Package com.example.demo.designPattern.builder
 * @date 2022-09-30 20:53
 */
public class Pepsi extends Drink {
    @Override
    public String getName() {
        return "Pepsi";
    }

    @Override
    public double getPrice() {
        return 2.5;
    }
}
