package com.lqhuy03.jfp.oop.l16_dif_overloading_overriding;

class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
    public double add(double a, double b) {
        return a + b;
    }
    public int add(int a, int b, int c) {
        return a + b + c;
    }
}

class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.add(1, 2));         // gọi int, int
        System.out.println(calc.add(1.5, 2.5));     // gọi double, double
        System.out.println(calc.add(1, 2, 3));      // gọi int, int, int
    }
}

