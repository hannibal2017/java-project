package com.example.demo.designPattern.proxy;

/**
 * @Author luozhenwu
 * @Date 2022/10/8 9:52
 * @Version 1.0
 **/
public class Test {
    public static void main(String[] args) {
        Image image = new ProxyImage("myPhoto.jpg");

        image.display();
        System.out.println("\n");
        image.display();
    }
}
