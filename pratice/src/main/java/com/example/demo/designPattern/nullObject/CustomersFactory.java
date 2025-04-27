package com.example.demo.designPattern.nullObject;

/**
 * @author edz
 * @version V1.0
 * @Package com.example.demo.designPattern.nullObject
 * @date 2022-10-23 21:35
 */
public class CustomersFactory {

    public static final String[] names = {"aa", "bb", "cc"};

    public static AbstractCustomers getCustomer(String name) {
        for (int i = 0; i < names.length; i++) {
            if (names[i].equalsIgnoreCase(name)) {
                return new RealCustomer(name);
            }
        }
        return new NullCustomer();
    }
}
