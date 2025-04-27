package com.example.demo.designPattern.command;

/**
 * @Author luozhenwu
 * @Date 2022/10/12 17:44
 * @Version 1.0
 **/
public class Test {
    public static void main(String[] args) {
        Stock stock = new Stock();

        BuyStock buyStock = new BuyStock(stock);

        SellStock sellStock = new SellStock(stock);

        Broker broker = new Broker();
        broker.addOrderList(buyStock);
        broker.addOrderList(sellStock);

        broker.placeOrderList();
    }
}
