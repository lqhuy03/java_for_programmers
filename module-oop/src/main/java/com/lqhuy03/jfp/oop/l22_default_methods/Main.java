package com.lqhuy03.jfp.oop.l22_default_methods;

interface InterfaceA {
    default void printSomething() {
        System.out.println("From InterfaceA");
    }
}

interface InterfaceB {
    default void printSomething() {
        System.out.println("From InterfaceB");
    }
}

public class Main implements InterfaceA, InterfaceB {
    @Override
    public void printSomething() {
        // Option 1: Viết code riêng
        System.out.println("From Main class");

        // Option 2: Gọi code từ interface cụ thể
        InterfaceA.super.printSomething();
        InterfaceB.super.printSomething();
    }

    public static void main(String[] args) {
        Main m = new Main();
        m.printSomething();
    }
}

