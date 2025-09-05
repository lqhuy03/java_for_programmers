package com.lqhuy03.jfp.basics.l10_conditional_logical;

class EvenInRange {

    public static boolean evenInRange(int x) {
        return x % 2 == 0 && x >= 24 && x <= 32;
    }

    public static void main(String[] args) {
        System.out.println(evenInRange(0));  // false
        System.out.println(evenInRange(24)); // true
        System.out.println(evenInRange(25)); // false
        System.out.println(evenInRange(34)); // false
    }
}
