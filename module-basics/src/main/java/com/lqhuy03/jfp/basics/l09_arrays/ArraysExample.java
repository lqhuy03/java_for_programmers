package com.lqhuy03.jfp.basics.l09_arrays;

import java.util.Arrays;

public class ArraysExample {
    public static void main(String[] args) {
        // Shortcut initialization
        int[] myNumbers = {42, 1, 17, 27, 16};

        // Sắp xếp
        Arrays.sort(myNumbers);

        // In ra mảng
        System.out.println("Sorted array: " + Arrays.toString(myNumbers));

        // Tìm kiếm nhị phân
        int index = Arrays.binarySearch(myNumbers, 17);
        System.out.println("Index of 17: " + index);

        // Khởi tạo mảng rỗng với new
        String[] names = new String[3]; // Mặc định null
        names[0] = "Alice";
        names[1] = "Bob";
        names[2] = "Charlie";
        System.out.println(Arrays.toString(names));

        // Độ dài mảng
        System.out.println("Length of names array: " + names.length);
    }
}
