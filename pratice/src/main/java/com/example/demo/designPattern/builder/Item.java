package com.example.demo.designPattern.builder;

/**
 * @author edz
 * @version V1.0
 * @Package com.example.demo.designPattern.builder
 * @date 2022-09-30 20:42
 */
public interface Item {

    String getName();

    Packing packing();

    double getPrice();
}
