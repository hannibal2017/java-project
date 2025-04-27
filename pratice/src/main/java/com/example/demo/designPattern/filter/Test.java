package com.example.demo.designPattern.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author luozhenwu
 * @Date 2022/10/6 16:54
 * @Version 1.0
 **/
public class Test {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<Person>();

        persons.add(new Person("Robert", "Male", "Single"));
        persons.add(new Person("John", "Male", "Married"));
        persons.add(new Person("Laura", "Female", "Married"));
        persons.add(new Person("Diana", "Female", "Single"));
        persons.add(new Person("Mike", "Male", "Single"));
        persons.add(new Person("Bobby", "Male", "Single"));

        Criteria male = new MalePerson();
        Criteria female = new FemalePerson();

        System.out.println("Males: ");
        printPersons(male.meetPersons(persons));

        System.out.println("\nFemales: ");
        printPersons(female.meetPersons(persons));
    }

    public static void printPersons(List<Person> persons) {
        for (Person person : persons) {
            System.out.println("Person : [ Name : " + person.getName()
                    + ", Gender : " + person.getGender()
                    + ", Marital Status : " + person.getMaritalStatus()
                    + " ]");
        }
    }

}
