package com.example.demo.designPattern.filter;

import java.util.List;

/**
 * @Author luozhenwu
 * @Date 2022/10/6 16:24
 * @Version 1.0
 **/
public interface Criteria {

    List<Person> meetPersons(List<Person> personList);
}
