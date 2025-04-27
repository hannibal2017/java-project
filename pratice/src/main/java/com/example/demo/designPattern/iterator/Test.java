package com.example.demo.designPattern.iterator;

/**
 * @Author luozhenwu
 * @Date 2022/10/13 11:43
 * @Version 1.0
 **/
public class Test {
    public static void main(String[] args) {
        NamesResposibility namesResposibility = new NamesResposibility();
        for (Iterator iterator = namesResposibility.getIterator(); iterator.hashNext(); ) {
            Object object = iterator.next();
            System.out.println(object);
        }
        System.out.println("第二种输出方式:");
        Iterator iterator = namesResposibility.getIterator();
        while (iterator.hashNext()) {
            System.out.println(iterator.next());
        }
    }
}
