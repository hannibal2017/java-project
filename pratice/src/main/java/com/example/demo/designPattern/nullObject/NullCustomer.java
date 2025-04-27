package com.example.demo.designPattern.nullObject;

/**
 * @author edz
 * @version V1.0
 * @Package com.example.demo.designPattern.nullObject
 * @date 2022-10-23 21:34
 */
public class NullCustomer extends AbstractCustomers {


    @Override
    public String getName() {
        return "null customer";
    }

    @Override
    public boolean isNull() {
        return true;
    }
}
