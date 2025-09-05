package com.lqhuy03.jfp.basics.l06_arithmetic;

public class ArithmeticExamples {
    public static void main(String[] args) {
        int a = 18, b = 5;

        // Integer division
        System.out.println("Integer division: " + (a / b)); // 3

        // Floating point division
        System.out.println("Floating point division: " + ((double) a / b)); // 3.6

        // Modulo
        System.out.println("Remainder: " + (a % b)); // 3

        // Combined assignment
        int x = 10;
        x += 5; // 15
        System.out.println("x after += 5: " + x);

        // Increment/Decrement
        int y = 5;
        System.out.println("Post-increment: " + (y++)); // 5, y = 6
        System.out.println("Pre-increment: " + (++y));  // 7, y = 7

        // Casting double to int
        double d = 9.99;
        int intValue = (int) d; // 9
        System.out.println("Cast double to int: " + intValue);
    }
}
