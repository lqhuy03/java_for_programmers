package com.lqhuy03.jfp.collections.l13_treemap_fetching_removal;

import java.util.Map.Entry;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<String, Integer> map = new TreeMap<>();
        map.put("Oracle", 43);
        map.put("Microsoft", 56);
        map.put("Apple", 76);
        map.put("Novartis", 87);

        // --- Fetching ---
        System.out.println("Value of Microsoft: " + map.get("Microsoft"));

        Entry<String, Integer> firstEntry = map.firstEntry();
        System.out.println("Smallest key: " + firstEntry.getKey() + ", Value: " + firstEntry.getValue());

        Entry<String, Integer> lastEntry = map.lastEntry();
        System.out.println("Largest key: " + lastEntry.getKey() + ", Value: " + lastEntry.getValue());

        // --- Removal ---
        System.out.println("Removing Oracle, old value: " + map.remove("Oracle"));
        System.out.println("Removing Google (not exists): " + map.remove("Google"));

        // --- Updating ---
        System.out.println("Replace Microsoft value: " + map.replace("Microsoft", 100));
        System.out.println("Current Microsoft: " + map.get("Microsoft"));

        System.out.println("Replace Apple if old value = 50: " + map.replace("Apple", 50, 90));
        System.out.println("Replace Apple if old value = 76: " + map.replace("Apple", 76, 90));
        System.out.println("Current Apple: " + map.get("Apple"));
    }
}
