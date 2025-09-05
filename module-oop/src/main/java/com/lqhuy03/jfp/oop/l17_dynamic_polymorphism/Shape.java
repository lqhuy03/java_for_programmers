package com.lqhuy03.jfp.oop.l17_dynamic_polymorphism;

class Shape {
    public void getArea() {
        System.out.println("Area of Shape");
    }
}

class Circle extends Shape {
    @Override
    public void getArea() {
        System.out.println("Area of Circle");
    }
}

class Rectangle extends Shape {
    @Override
    public void getArea() {
        System.out.println("Area of Rectangle");
    }
}

class Main {
    public static void main(String[] args) {
        Shape obj1 = new Circle();    // Shape reference → Circle object
        Shape obj2 = new Rectangle(); // Shape reference → Rectangle object

        obj1.getArea(); // Output: Area of Circle
        obj2.getArea(); // Output: Area of Rectangle
    }
}

