package com.lqhuy03.jfp.oop.l05_methods;

class Demo {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        System.out.println(cal.product(10.0, 20.0));      // double, 2 params
        System.out.println(cal.product(10.0, 20.0, 5.0)); // double, 3 params
        System.out.println(cal.product(12, 4));           // int, 2 params
    }
}
