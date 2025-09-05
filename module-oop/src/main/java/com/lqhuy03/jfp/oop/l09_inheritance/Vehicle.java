package com.lqhuy03.jfp.oop.l09_inheritance;

class Vehicle {
    public void start() {
        System.out.println("Vehicle starts");
    }
}

class Car extends Vehicle {  // Car kế thừa Vehicle
    public void honk() {
        System.out.println("Car honks");
    }
}

class Main {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.start(); // từ Vehicle
        myCar.honk();  // từ Car
    }
}
