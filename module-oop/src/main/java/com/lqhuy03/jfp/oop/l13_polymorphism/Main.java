package com.lqhuy03.jfp.oop.l13_polymorphism;

public class Main {
    public static void main(String[] args) {
        Shape s1 = new Rectangle();
        Shape s2 = new Circle();

        s1.calculateArea(); // Gọi phiên bản của Rectangle
        s2.calculateArea(); // Gọi phiên bản của Circle
    }
}
