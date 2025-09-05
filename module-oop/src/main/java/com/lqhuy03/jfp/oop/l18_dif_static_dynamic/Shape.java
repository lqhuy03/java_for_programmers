package com.lqhuy03.jfp.oop.l18_dif_static_dynamic;

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
        return radius * radius * 3.14;
    }
}

class Rectangle extends Shape {
    private double length, width;
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    @Override
    public double getArea() {
        return length * width;
    }
}

//class Main {
//    public static void main(String[] args) {
//        Shape[] shapes = new Shape[2];
//        shapes[0] = new Circle(2);
//        shapes[1] = new Rectangle(2, 3);
//
//        System.out.println("Circle Area: " + shapes[0].getArea());     // Gọi Circle.getArea()
//        System.out.println("Rectangle Area: " + shapes[1].getArea()); // Gọi Rectangle.getArea()
//    }
//}

