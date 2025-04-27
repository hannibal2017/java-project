package com.example.demo.designPattern.builder;

/**
 * @author edz
 * @version V1.0
 * @Package com.example.demo.designPattern.builder
 * @date 2022-09-30 20:51
 */
public abstract class Drink implements Item {

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract double getPrice();

}
