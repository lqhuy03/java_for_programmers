package com.lqhuy03.jfp.collections.l01_arrayslist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        // Thêm phần tử
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list); // [1, 2, 3]

        list.add(4); // Thêm cuối
        list.add(1, 50); // Thêm tại index 1
        System.out.println(list); // [1, 50, 2, 3, 4]

        List<Integer> newList = new ArrayList<>();
        newList.add(150);
        newList.add(160);

        list.addAll(newList); // Thêm tất cả từ newList
        System.out.println(list); // [1, 50, 2, 3, 4, 150, 160]

        // Lấy phần tử và kích thước
        System.out.println("Element at index 1: " + list.get(1)); // 50
        System.out.println("Size of list: " + list.size()); // 7
    }
}
