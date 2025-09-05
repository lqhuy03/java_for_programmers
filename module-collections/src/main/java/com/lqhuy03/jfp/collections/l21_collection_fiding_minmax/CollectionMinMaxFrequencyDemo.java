package com.lqhuy03.jfp.collections.l21_collection_fiding_minmax;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionMinMaxFrequencyDemo {

    public static void main(String[] args) {
        // Tạo danh sách các số nguyên
        List<Integer> list = new ArrayList<>();
        list.add(34);
        list.add(12);
        list.add(9);
        list.add(76);
        list.add(29);
        list.add(75);
        list.add(9);
        list.add(12);
        list.add(9);

        // 1️⃣ Tìm phần tử nhỏ nhất
        int minElement = Collections.min(list);
        System.out.println("Phần tử nhỏ nhất trong List là: " + minElement);

        // 2️⃣ Tìm phần tử lớn nhất
        int maxElement = Collections.max(list);
        System.out.println("Phần tử lớn nhất trong List là: " + maxElement);

        // 3️⃣ Đếm số lần xuất hiện của phần tử 9
        int frequencyOf9 = Collections.frequency(list, 9);
        System.out.println("Số lần số 9 xuất hiện trong List: " + frequencyOf9);
    }
}

