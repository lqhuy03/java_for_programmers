package com.lqhuy03.jfp.collections.l02_arraylist_operations;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(10);

        // Xóa
        list.remove(1); // Xóa index 1 (20)
        list.remove(Integer.valueOf(30)); // Xóa giá trị 30
        System.out.println(list);

        // Cập nhật
        list.set(1, 100);
        System.out.println(list);

        // Kiểm tra
        if (list.contains(100)) {
            System.out.println("List contains 100");
        }
        System.out.println("First index of 10: " + list.indexOf(10));
        System.out.println("Last index of 10: " + list.lastIndexOf(10));

        // Thay toàn bộ giá trị
        List<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.replaceAll(e -> e.toUpperCase());
        System.out.println(fruits);

        // Xóa tất cả
        list.clear();
        System.out.println(list); // []
    }
}
