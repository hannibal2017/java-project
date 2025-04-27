package com.example.demo.designPattern.builder;

/**
 * @author edz
 * @version V1.0
 * @Package com.example.demo.designPattern.builder
 * @date 2022-09-30 21:06
 */
public class Test {
    public static void main(String[] args) {
        Meal first = MealBuilder.orderFirst();

        Meal second = MealBuilder.orderSecond();

        double costFirst = first.getAllPrices();

        System.out.println("costFirst=" + costFirst);

        first.showItems();

        double costSecond = second.getAllPrices();

        System.out.println("costSecond=" + costSecond);

        second.showItems();
    }
}
