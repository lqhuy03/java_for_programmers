package com.lqhuy03.jfp.collections.l17_enummap;

import java.util.EnumMap;

// Enum định nghĩa các loại trái cây
enum Fruit {
    APPLE, BANANA, ORANGE
}

public class EnumMapDemo {
    public static void main(String[] args) {
        // Tạo EnumMap với key là Fruit
        EnumMap<Fruit, Integer> fruitStock = new EnumMap<>(Fruit.class);

        // Thêm dữ liệu
        fruitStock.put(Fruit.APPLE, 50);
        fruitStock.put(Fruit.BANANA, 30);
        fruitStock.put(Fruit.ORANGE, 20);

        // Lấy giá trị
        System.out.println("Số lượng táo: " + fruitStock.get(Fruit.APPLE));

        // Cập nhật
        fruitStock.put(Fruit.BANANA, 40);
        System.out.println("Cập nhật số lượng chuối: " + fruitStock);

        // Xóa phần tử
        fruitStock.remove(Fruit.ORANGE);
        System.out.println("Sau khi xóa cam: " + fruitStock);
    }
}
