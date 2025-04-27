package com.example.demo.designPattern.command;

/**
 * @Author luozhenwu
 * @Date 2022/10/12 17:35
 * @Version 1.0
 **/
public class BuyStock implements Order {

    public Stock moneyStock;

    public BuyStock(Stock stock) {
        this.moneyStock = stock;
    }

    @Override
    public void execute() {
        moneyStock.buy();
    }
}
