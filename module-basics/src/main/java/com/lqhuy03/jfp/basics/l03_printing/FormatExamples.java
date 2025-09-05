package com.lqhuy03.jfp.basics.l03_printing;

public class FormatExamples {
    public static void main(String[] args) {
        double pi = 3.14159265;
        System.out.format("Pi ≈ %.3f%n", pi);
        System.out.format("%2d %2d %2d%n", 4, 6, 8);
        System.out.format("%2d %2d %2d%n", 8, 12, 16);
    }
}
