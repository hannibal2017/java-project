package com.example.demo.designPattern.mediator;

/**
 * @Author luozhenwu
 * @Date 2022/10/13 17:36
 * @Version 1.0
 * @description 中介者模式
 **/
public class Test {
    public static void main(String[] args) {
        User zhangsan = new User("zhangsan");
        User lisi = new User("lisi");

        zhangsan.sendMessage("hello,lisi");
        lisi.sendMessage("hello,zhangsan");
    }


}
