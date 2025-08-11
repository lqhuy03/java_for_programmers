package com.you.jfp.mt.l04_executors;

import java.util.concurrent.*;

public class PoolDemo {
    public static void main(String[] args) throws Exception {
        ExecutorService pool = Executors.newFixedThreadPool(4);
        Future<Integer> f = pool.submit(() -> 40 + 2);
        System.out.println("Answer = " + f.get());
        pool.shutdown();
    }
}
