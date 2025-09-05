package com.lqhuy03.jfp.collections.l19_array_sort;

import java.util.Arrays;

public class ArraysSortDemo {

    public static void main(String[] args) {
        // 1️⃣ Sắp xếp mảng số nguyên toàn bộ (sort ascending)
        Integer[] numbers = {10, 2, 32, 12, 15, 76, 17, 48, 79, 9};
        Arrays.sort(numbers); // QuickSort (primitive) hoặc MergeSort (object)
        System.out.println("Sắp xếp toàn bộ mảng:");
        System.out.println(Arrays.toString(numbers));

        // 2️⃣ Sắp xếp một phần mảng (chỉ từ index 2 đến index 6)
        Integer[] partialNumbers = {10, 2, 32, 12, 15, 76, 17, 48, 79, 9};
        Arrays.sort(partialNumbers, 2, 7); // Chỉ sort từ index 2 → 6
        System.out.println("\nSắp xếp một phần mảng (index 2→6):");
        System.out.println(Arrays.toString(partialNumbers));

        // 3️⃣ Sắp xếp song song (Java 8 trở lên)
        Integer[] parallelNumbers = {10, 2, 32, 12, 15, 76, 17, 48, 79, 9};
        Arrays.parallelSort(parallelNumbers); // Parallel sort nếu mảng đủ lớn
        System.out.println("\nSắp xếp song song:");
        System.out.println(Arrays.toString(parallelNumbers));

        // 4️⃣ Sắp xếp mảng String (theo thứ tự alphabet)
        String[] fruits = {"Orange", "Apple", "Banana", "Grape"};
        Arrays.sort(fruits);
        System.out.println("\nSắp xếp mảng String:");
        System.out.println(Arrays.toString(fruits));

        // 5️⃣ Sắp xếp mảng số nguyên theo thứ tự giảm dần (dùng Comparator)
        Integer[] descendingNumbers = {10, 2, 32, 12, 15, 76, 17, 48, 79, 9};
        Arrays.sort(descendingNumbers, (a, b) -> b - a); // Descending
        System.out.println("\nSắp xếp giảm dần:");
        System.out.println(Arrays.toString(descendingNumbers));
    }
}
