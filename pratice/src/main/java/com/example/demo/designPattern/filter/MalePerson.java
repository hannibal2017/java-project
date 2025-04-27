package com.example.demo.designPattern.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author luozhenwu
 * @Date 2022/10/6 16:26
 * @Version 1.0
 **/
public class MalePerson implements Criteria {

    private List<Person> personListFilter = new ArrayList<>();

    @Override
    public List<Person> meetPersons(List<Person> personList) {
        for (Person person : personList) {
            if (person.getGender().equalsIgnoreCase("male")) {
                personListFilter.add(person);
            }
        }
        return personListFilter;
    }
}
