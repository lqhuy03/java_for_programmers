package com.lqhuy03.jfp.oop.l10_syntax_terminologies;

// Base Class
class Vehicle {
    private String make, color, model;
    private int year;

    public Vehicle(String make, String color, int year, String model) {
        this.make = make;
        this.color = color;
        this.year = year;
        this.model = model;
    }

    public void printDetails() {
        System.out.println("Manufacturer: " + make);
        System.out.println("Color: " + color);
        System.out.println("Year: " + year);
        System.out.println("Model: " + model);
    }
}

// Derived Class
class Car extends Vehicle {
    private String bodyStyle;

    public Car(String make, String color, int year, String model, String bodyStyle) {
        super(make, color, year, model); // Gọi constructor cha
        this.bodyStyle = bodyStyle;
    }

    public void carDetails() {
        printDetails(); // gọi method của cha
        System.out.println("Body Style: " + bodyStyle);
    }
}

class Main {
    public static void main(String[] args) {
        Car elantra = new Car("Hyundai", "Red", 2019, "Elantra", "Sedan");
        elantra.carDetails();
    }
}
