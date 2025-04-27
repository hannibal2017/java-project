package com.example.demo.designPattern.builder;

/**
 * @author edz
 * @version V1.0
 * @Package com.example.demo.designPattern.builder
 * @date 2022-09-30 20:44
 */
public abstract class Burger implements Item {

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract double getPrice();
}
