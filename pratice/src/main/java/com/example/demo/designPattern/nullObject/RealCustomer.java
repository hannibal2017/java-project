package com.example.demo.designPattern.nullObject;

/**
 * @author edz
 * @version V1.0
 * @Package com.example.demo.designPattern.nullObject
 * @date 2022-10-23 21:31
 */
public class RealCustomer extends AbstractCustomers {

    public RealCustomer(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean isNull() {
        return false;
    }
}
