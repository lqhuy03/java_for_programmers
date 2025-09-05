package com.lqhuy03.jfp.oop.l13_polymorphism;

class Shape {
    public void calculateArea() {
        System.out.println("Calculating area for a shape");
    }
}

class Rectangle extends Shape {
    @Override
    public void calculateArea() {
        System.out.println("Rectangle area = length * width");
    }
}

class Circle extends Shape {
    @Override
    public void calculateArea() {
        System.out.println("Circle area = π * r^2");
    }
}


