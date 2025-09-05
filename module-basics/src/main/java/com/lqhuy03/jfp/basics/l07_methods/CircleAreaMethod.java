package com.lqhuy03.jfp.basics.l07_methods;

public class CircleAreaMethod {
    public static double circleArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        double r = 5.0;
        double area = circleArea(r);
        System.out.println("Area: " + area);
    }
}
