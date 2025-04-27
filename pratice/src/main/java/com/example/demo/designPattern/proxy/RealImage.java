package com.example.demo.designPattern.proxy;

/**
 * @Author luozhenwu
 * @Date 2022/10/8 9:48
 * @Version 1.0
 **/
public class RealImage implements Image {

    private String name;

    public RealImage(String name) {
        this.name = name;
        loadFromDisk(name);
    }

    private void loadFromDisk(String name) {
        System.out.println("load from disk : " + name);
    }

    @Override
    public void display() {
        System.out.println("display : " + name);
    }
}
