package com.lqhuy03.jfp.basics.l12_while_loops;

class PrintFactors {
    public static void printFactors(int number) {
        int possibleFactor = 1;
        while (possibleFactor <= number) {
            if (number % possibleFactor == 0) {
                System.out.format("%d is a possible factor of %d.%n",
                    possibleFactor, number);
            }
            possibleFactor++;
        }
    }

    public static void main(String[] args) {
        printFactors(42);
    }
}
