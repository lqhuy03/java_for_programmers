package com.lqhuy03.jfp.basics.l11_if_statements;

import java.util.Random;

class CoinFlip {
    public static void main(String[] args) {
        Random rand = new Random();
        int n = rand.nextInt(2); // 0 hoặc 1
        System.out.println("Picked random value " + n);

        if (n == 0) {
            System.out.println("Tails");
        } else {
            System.out.println("Heads");
        }
    }
}
