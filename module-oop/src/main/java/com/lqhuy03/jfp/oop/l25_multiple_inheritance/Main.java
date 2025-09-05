package com.lqhuy03.jfp.oop.l25_multiple_inheritance;

class Car {
    private int model;
    private String manufacturer;

    public Car(int model, String manufacturer) {
        this.model = model;
        this.manufacturer = manufacturer;
    }

    public void printDetails() {
        System.out.println("Model: " + model);
        System.out.println("Manufacturer: " + manufacturer);
    }
}

interface IsSedan {
    int bootSpace = 420; // public static final mặc định

    void bootSpace(); // abstract method
}

class Elantra extends Car implements IsSedan {
    private String variant;

    public Elantra(int model, String variant) {
        super(model, "Hyundai");
        this.variant = variant;
    }

    @Override
    public void bootSpace() {
        System.out.println("Boot space: " + IsSedan.bootSpace + " litres");
    }

    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Variant: " + variant);
    }
}

public class Main {
    public static void main(String[] args) {
        Elantra sport = new Elantra(2019, "Sport");
        sport.printDetails();
        sport.bootSpace();
    }
}
