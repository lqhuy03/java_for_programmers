package com.lqhuy03.jfp.collections.l07_comparator;

import java.util.Comparator;

public class BrandComparator implements Comparator<Vehicle> {
    @Override
    public int compare(Vehicle o1, Vehicle o2) {
        // Null-safe: null Vehicle đứng sau
        if (o1 == o2) return 0;
        if (o1 == null) return 1;
        if (o2 == null) return -1;

        String b1 = o1.getBrand();
        String b2 = o2.getBrand();

        // Null brand đứng sau, so sánh không phân biệt hoa thường
        if (b1 == b2) return 0;
        if (b1 == null) return 1;
        if (b2 == null) return -1;

        return b1.compareToIgnoreCase(b2);
    }
}
