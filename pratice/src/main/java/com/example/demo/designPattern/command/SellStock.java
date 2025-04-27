package com.example.demo.designPattern.command;

/**
 * @Author luozhenwu
 * @Date 2022/10/12 17:39
 * @Version 1.0
 **/
public class SellStock implements Order {

    public Stock moneyStock;

    public SellStock(Stock stock) {
        this.moneyStock = stock;
    }

    @Override
    public void execute() {
        moneyStock.sell();
    }
}
