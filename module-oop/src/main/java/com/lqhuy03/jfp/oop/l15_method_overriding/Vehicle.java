package com.lqhuy03.jfp.oop.l15_method_overriding;

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

class Rectangle extends Shape {
    private double width, height;
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    @Override
    public double getArea() {
        return width * height;
    }
}

class Main {
    public static void main(String[] args) {
        Shape s1 = new Circle(2);
        Shape s2 = new Rectangle(2, 3);

        System.out.println(s1.getArea()); // Gọi Circle.getArea()
        System.out.println(s2.getArea()); // Gọi Rectangle.getArea()
    }
}

