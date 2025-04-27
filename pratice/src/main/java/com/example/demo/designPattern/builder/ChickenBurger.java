package com.example.demo.designPattern.builder;

/**
 * @author edz
 * @version V1.0
 * @Package com.example.demo.designPattern.builder
 * @date 2022-09-30 20:50
 */
public class ChickenBurger extends Burger {
    @Override
    public String getName() {
        return "ChickenBurger";
    }

    @Override
    public double getPrice() {
        return 3.5;
    }
}
