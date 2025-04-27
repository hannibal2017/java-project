package com.example.demo.designPattern.command;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author luozhenwu
 * @Date 2022/10/12 17:41
 * @Version 1.0
 **/
public class Broker {

    private List<Order> orderList = new ArrayList<>();

    public void addOrderList(Order order) {
        orderList.add(order);
    }

    public void placeOrderList() {
        for (Order order : orderList) {
            order.execute();
        }
        orderList.clear();
    }
}
