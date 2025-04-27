package com.example.demo.designPattern.flyWeight;

import com.google.common.collect.Lists;

import java.util.List;
import java.util.Random;

/**
 * @author edz
 * @version V1.0
 * @Package com.example.demo.designPattern.flyWeight
 * @date 2022-10-07 18:58
 */
public class Test {

    public static final List colorsList = Lists.newArrayList("blue", "red", "orange", "yellow", "black");

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            System.out.println("i = " + i);
            String color = getRandomColor();
            Circle circle = (Circle) ShapeFactory.getShape(color);
            Random random = new Random();
            int r = random.nextInt(200);
            circle.setX(r);
            circle.setY(r);
            circle.setRedius(r);
            circle.draw();
        }
    }

    public static String getRandomColor() {
        Random random = new Random();
        int r = random.nextInt(4);
        return (String) colorsList.get(r);
    }
}
