package com.lqhuy03.jfp.oop.l26_aggregation;

class Country {
    private String name;
    private int population;

    public Country(String n, int p) {
        name = n;
        population = p;
    }
    public String getName() {
        return name;
    }
}

class Person {
    private String name;
    private Country country; // HAS-A Country

    public Person(String n, Country c) {
        name = n;
        country = c;
    }

    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Country: " + country.getName());
    }
}

public class Main {
    public static void main(String[] args) {
        Country country = new Country("Utopia", 1);
        {
            Person user = new Person("Darth Vader", country);
            user.printDetails();
        }
        // user đã hết scope nhưng country vẫn tồn tại
        System.out.println(country.getName());
    }
}
