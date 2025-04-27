package com.example.demo.designPattern.builder;

/**
 * @author edz
 * @version V1.0
 * @Package com.example.demo.designPattern.builder
 * @date 2022-09-30 20:49
 */
public class VegBurger extends Burger {
    @Override
    public String getName() {
        return "VegBurger";
    }

    @Override
    public double getPrice() {
        return 2.0;
    }
}
