package com.lqhuy03.jfp.oop.l12_typeof_inheritance;

class Vehicle {
    void start() { System.out.println("Vehicle starts"); }
}

class Car extends Vehicle {
    void honk() { System.out.println("Car honks"); }
}

class Truck extends Vehicle {
    void loadCargo() { System.out.println("Truck loading"); }
}

class Main {
    public static void main(String[] args) {
        Car c = new Car();
        Truck t = new Truck();
        c.start();
        t.start();
    }
}
