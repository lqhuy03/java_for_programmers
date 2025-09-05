package com.lqhuy03.jfp.oop.l16_dif_overloading_overriding;

class Shape {
    public double getArea() {
        return 0;
    }
}

class Circle extends Shape {
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

//public class Main {
//    public static void main(String[] args) {
//        Shape s = new Circle(2);
//        System.out.println(s.getArea()); // runtime mới biết gọi Circle.getArea()
//    }
//}

