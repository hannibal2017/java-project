package com.example.demo.designPattern.proxy;

/**
 * @Author luozhenwu
 * @Date 2022/10/8 9:50
 * @Version 1.0
 **/
public class ProxyImage implements Image {

    private RealImage realImage;

    private String name;

    public ProxyImage(String name) {
        this.name = name;
    }

    @Override
    public void display() {
        if (realImage == null) {
            realImage = new RealImage(name);
        }
        realImage.display();
    }
}
