package com.lqhuy03.jfp.collections.l07_comparator;

import java.util.Comparator;

public class MakeYearComparator implements Comparator<Vehicle> {
    @Override
    public int compare(Vehicle o1, Vehicle o2) {
        // Null-safe: null Vehicle đứng sau
        if (o1 == o2) return 0;
        if (o1 == null) return 1;
        if (o2 == null) return -1;

        Integer y1 = o1.getMakeYear();
        Integer y2 = o2.getMakeYear();

        // Null year đứng sau
        if (y1 == y2) return 0;
        if (y1 == null) return 1;
        if (y2 == null) return -1;

        return Integer.compare(y1, y2);
    }
}
