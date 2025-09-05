package com.lqhuy03.jfp.oop.challenge06_aggregation_composition;

class Vehicle {
    private String model;
    private int id;

    public Vehicle(String model, int id) {
        this.id = id;
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public int getId() {
        return id;
    }
}

class Driver {
    private String driverName;
    private Vehicle vehicle; // Association

    public Driver(String driverName, Vehicle vehicle) {
        this.driverName = driverName;
        this.vehicle = vehicle;
    }

    public void printDetails() {
        System.out.println(driverName +
            " is a driver of car Id: " + vehicle.getId() +
            ", Model: " + vehicle.getModel());
    }
}

class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("Volvo S60", 4453);
        Driver driver = new Driver("John", vehicle);
        driver.printDetails();
    }
}

