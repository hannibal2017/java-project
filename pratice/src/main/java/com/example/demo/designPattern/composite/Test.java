package com.example.demo.designPattern.composite;

/**
 * @Author luozhenwu
 * @Date 2022/10/6 17:22
 * @Version 1.0
 **/
public class Test {
    public static void main(String[] args) {
        Employee CEO = new Employee("黄总", "CEO", 22000);

        Employee technologyLeader = new Employee("李总", "CTO", 20000);
        Employee marketLeader = new Employee("张总", "销售总监", 15000);
        Employee programmer1 = new Employee("小黄", "程序员", 10000);
        Employee programmer2 = new Employee("小罗", "程序员", 10000);
        Employee market1 = new Employee("小黄", "金牌销售", 12000);
        Employee market2 = new Employee("小罗", "金牌销售", 11000);

        technologyLeader.add(programmer1);
        technologyLeader.add(programmer2);

        marketLeader.add(market1);
        marketLeader.add(market2);

        CEO.add(technologyLeader);
        CEO.add(marketLeader);

        System.out.println(CEO);

        for (Employee employee : CEO.getSubordinates()) {
            System.out.println(employee);
            for (Employee worker : employee.getSubordinates()) {
                System.out.println(worker);
            }
        }
    }
}
