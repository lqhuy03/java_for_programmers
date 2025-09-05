package com.lqhuy03.jfp.collections.l10_treeset;

import java.util.*;

public class TreeSetDemo {
    public static void main(String[] args) {
        // Ascending order
        TreeSet<Integer> set = new TreeSet<>();
        set.add(21);
        set.add(32);
        set.add(44);
        set.add(11);
        set.add(54);
        System.out.println("Ascending order: " + set);

        // Descending order
        TreeSet<Integer> reverseSet = new TreeSet<>(Comparator.reverseOrder());
        reverseSet.addAll(set);
        System.out.println("Descending order: " + reverseSet);
    }
}
