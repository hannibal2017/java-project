package com.example.demo.designPattern.nullObject;

/**
 * @author edz
 * @version V1.0
 * @Package com.example.demo.designPattern.nullObject
 * @date 2022-10-23 21:39
 */
public class Test {
    public static void main(String[] args) {
        AbstractCustomers aa = CustomersFactory.getCustomer("aa");
        AbstractCustomers bb = CustomersFactory.getCustomer("bb");
        AbstractCustomers ff = CustomersFactory.getCustomer("ff");

        System.out.println(aa.getName());
        System.out.println(bb.getName());
        System.out.println(ff.getName());
    }
}
