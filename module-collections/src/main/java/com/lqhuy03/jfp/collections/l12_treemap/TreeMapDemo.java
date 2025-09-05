package com.lqhuy03.jfp.collections.l12_treemap;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        // TreeMap giảm dần
        TreeMap<String, Integer> reverseMap = new TreeMap<>(Comparator.reverseOrder());
        reverseMap.put("Oracle", 43);
        reverseMap.put("Microsoft", 56);
        reverseMap.put("Apple", 43);
        reverseMap.put("Novartis", 87);
        System.out.println("Reverse order: " + reverseMap);

        // HashMap (thứ tự ngẫu nhiên)
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Oracle", 43);
        hashMap.put("Microsoft", 56);
        hashMap.put("Apple", 43);
        hashMap.put("Novartis", 87);
        System.out.println("Random order: " + hashMap);

        // TreeMap từ HashMap (tăng dần)
        TreeMap<String, Integer> treeMap1 = new TreeMap<>(hashMap);
        System.out.println("Ascending order: " + treeMap1);

        // TreeMap từ TreeMap giảm dần
        TreeMap<String, Integer> treeMap2 = new TreeMap<>(reverseMap);
        System.out.println("Descending order copy: " + treeMap2);
    }
}

