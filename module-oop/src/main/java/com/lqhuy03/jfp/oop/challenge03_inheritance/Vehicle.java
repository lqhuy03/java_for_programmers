package com.lqhuy03.jfp.oop.challenge03_inheritance;

// Base Class
class Vehicle {

    protected String name;
    // Private Data Members
    private String speed;
    private String model;

    public Vehicle() { // Default Constructor
        speed = "100";
        model = "Tesla";
    }

    // Getter Function
    public String getSpeed() {
        return speed;
    }

    // Getter Function
    public String getModel() {
        return model;
    }

}

// Derived Class
class Car extends Vehicle {
    private String name;

    public Car() { this.name = ""; }
    public Car(String name) { this.name = name; }

    public static void main(String args[]) {
        Car car = new Car();
        System.out.println(car.getDetails("X"));
    }

    public String getName() { return name; }
    public void setDetails(String name) { this.name = name; }

    @Override
    public String toString() {
        return getDetails(name); // re-use format
    }

    public String getDetails(String carName) {
        return carName + ", " + getModel() + ", " + getSpeed();
    }
}



