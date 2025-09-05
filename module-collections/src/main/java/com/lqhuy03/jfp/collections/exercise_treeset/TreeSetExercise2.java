package com.lqhuy03.jfp.collections.exercise_treeset;

import java.util.TreeSet;

public class TreeSetExercise2 {
    public static void main(String[] args) {
        int[] numbers = {1,4,5,2,34,66,5,4,33,45,6,8,56,76,78,98,34,37,12,12,23,43,54,56};

        TreeSet<Integer> set = new TreeSet<>();
        for (int n : numbers) {
            set.add(n);
        }

        System.out.println("Smallest number: " + set.first());
        System.out.println("Largest number: " + set.last());
    }
}
