package com.example.demo.designPattern.builder;

/**
 * @author edz
 * @version V1.0
 * @Package com.example.demo.designPattern.builder
 * @date 2022-09-30 21:03
 */
public class MealBuilder {

    //套餐一
    public static Meal orderFirst() {
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    //套餐二
    public static Meal orderSecond() {
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
