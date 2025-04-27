package com.example.demo.designPattern.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * @author edz
 * @version V1.0
 * @Package com.example.demo.designPattern.builder
 * @date 2022-09-30 20:54
 */
public class Meal {

    private List<Item> itemList = new ArrayList<>();

    public void addItem(Item item) {
        itemList.add(item);
    }

    public void showItems() {
        for (Item item : itemList) {
            System.out.println(item.getName() + "|" + item.getPrice() + "|" + item.packing().pack());
        }
    }

    public double getAllPrices() {
        double allPrice = 0;
        for (Item item : itemList) {
            allPrice += item.getPrice();
        }
        return allPrice;
    }
}
