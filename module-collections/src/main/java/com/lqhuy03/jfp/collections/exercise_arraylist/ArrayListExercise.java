package com.lqhuy03.jfp.collections.exercise_arraylist;

import java.util.*;
import java.util.stream.Collectors;

class Employee {
    String name;
    int age;
    String country;

    public Employee(String name, int age, String country) {
        this.name = name;
        this.age = age;
        this.country = country;
    }

    @Override
    public String toString() {
        return name + " (" + age + ", " + country + ")";
    }
}

public class ArrayListExercise {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>(Arrays.asList(
            new Employee("Alex", 23, "USA"),
            new Employee("Dave", 34, "India"),
            new Employee("Carl", 21, "USA"),
            new Employee("Joe", 56, "Russia"),
            new Employee("Amit", 64, "China"),
            new Employee("Ryan", 19, "Brazil")
        ));

        // Problem 1: Employees aged over 50
        System.out.println("Employees aged over 50:");
        list.stream()
            .filter(emp -> emp.age > 50)
            .map(emp -> emp.name)
            .forEach(System.out::println);

        // Problem 2: Remove employees from USA
        list = list.stream()
            .filter(emp -> !emp.country.equals("USA"))
            .collect(Collectors.toList());

        System.out.println("\nList after removing USA employees:");
        list.forEach(System.out::println);

        // Problem 3: Sort employees by country
        list = list.stream()
            .sorted(Comparator.comparing(emp -> emp.country))
            .collect(Collectors.toList());

        System.out.println("\nEmployees sorted by country:");
        list.forEach(System.out::println);
    }
}

