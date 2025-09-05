package com.lqhuy03.jfp.oop.l18_dif_static_dynamic;

class Calculator {
    int add(int a, int b) {
        return a + b;
    }
    double add(double a, double b) {
        return a + b;
    }
}

class Main {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println(c.add(2, 3));      // Gọi add(int, int)
        System.out.println(c.add(2.5, 3.5));  // Gọi add(double, double)
    }
}
