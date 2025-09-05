package com.lqhuy03.jfp.basics.l14_foreach_loops;

public class ForEachExample {
    public static void main(String[] args) {
        int[] primes = {2, 3, 5, 7, 11, 13};

        for (int p : primes) {
            System.out.println(p);
        }
    }
}
