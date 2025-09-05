package com.lqhuy03.jfp.oop.l11_super;

class Vehicle {
    Vehicle(String name) {
        System.out.println("Vehicle: " + name);
    }
}

class Car extends Vehicle {
    Car(String name, String type) {
        super(name); // Gọi constructor của Vehicle
        System.out.println("Car type: " + type);
    }
}

class Main {
    public static void main(String[] args) {
        Car c = new Car("Hyundai", "Sedan");
    }
}

