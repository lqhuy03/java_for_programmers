package com.you.jfp.recursion.l03_numbers;

public class Gcd {
    public static int gcd(int a, int b) {
        return (b == 0) ? Math.abs(a) : gcd(b, a % b);
    }
}
