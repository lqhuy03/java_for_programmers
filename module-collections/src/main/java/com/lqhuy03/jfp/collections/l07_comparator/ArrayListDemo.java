package com.lqhuy03.jfp.collections.l07_comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo {

    public static void main(String[] args) {
        List<Vehicle> list = new ArrayList<>();
        list.add(new Vehicle("Volkswagen", 2010));
        list.add(new Vehicle("Audi", 2009));
        list.add(new Vehicle("Ford", 2001));
        list.add(new Vehicle("BMW", 2015));

        System.out.println("Sorting by brand name.");
        Collections.sort(list, new BrandComparator());
        for (Vehicle vehicle : list) {
            System.out.println("Vehicle Brand: " + vehicle.getBrand()
                + ", Vehicle Make: " + vehicle.getMakeYear());
        }

        System.out.println("\nSorting by make year.");
        Collections.sort(list, new MakeYearComparator());
        for (Vehicle vehicle : list) {
            System.out.println("Vehicle Brand: " + vehicle.getBrand()
                + ", Vehicle Make: " + vehicle.getMakeYear());
        }

        // Gợi ý: Java 8+ có thể viết gọn bằng lambda
        // list.sort((v1, v2) -> v1.getBrand().compareToIgnoreCase(v2.getBrand()));
        // list.sort((v1, v2) -> Integer.compare(v1.getMakeYear(), v2.getMakeYear()));
    }
}
