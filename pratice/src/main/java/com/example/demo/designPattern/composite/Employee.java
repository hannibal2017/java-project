package com.example.demo.designPattern.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author luozhenwu
 * @Date 2022/10/6 17:16
 * @Version 1.0
 **/
public class Employee {
    private String name;
    private String dept;
    private Integer salary;
    private List<Employee> subordinates;

    public Employee(String name, String dept, Integer salary) {
        this.name = name;
        this.dept = dept;
        this.salary = salary;
        subordinates = new ArrayList<>();
    }

    public void add(Employee e) {
        subordinates.add(e);
    }

    public void remove(Employee e) {
        subordinates.remove(e);
    }

    public List<Employee> getSubordinates() {
        return subordinates;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", salary=" + salary +
                ", subordinates=" + subordinates +
                '}';
    }
}
