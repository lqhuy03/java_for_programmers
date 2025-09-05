package com.lqhuy03.jfp.collections.excercise_hashmap;

import java.util.*;

public class HashMapExercises {
    public static void main(String[] args) {

        // Tạo HashMap stockPrice
        Map<String, Integer> stockPrice = new HashMap<>();
        stockPrice.put("Oracle", 56);
        stockPrice.put("Fiserv", 117);
        stockPrice.put("BMW", 73);
        stockPrice.put("Microsoft", 213);
        stockPrice.put("Google", 421);
        stockPrice.put("Ford", 456);
        stockPrice.put("Novartis", 43);
        stockPrice.put("TCS", 23);

        System.out.println("=== DỮ LIỆU GỐC ===");
        stockPrice.forEach((k, v) -> System.out.println(k + " -> " + v));

        // ==============================
        // Problem 1: Tìm công ty có giá cao nhất
        // ==============================
        System.out.println("\n=== Problem 1: Max Stock Price ===");

        // Cách 1: Classic
        int maxPrice = Integer.MIN_VALUE;
        String maxCompany = null;
        for (Map.Entry<String, Integer> entry : stockPrice.entrySet()) {
            if (entry.getValue() > maxPrice) {
                maxPrice = entry.getValue();
                maxCompany = entry.getKey();
            }
        }
        System.out.println("[Classic] Company with max stock price: " + maxCompany + " (" + maxPrice + ")");

        // Cách 2: Java 8+
        String maxCompanyStream = stockPrice.entrySet()
            .stream()
            .max(Map.Entry.comparingByValue())
            .map(Map.Entry::getKey)
            .orElse(null);
        System.out.println("[Java 8+] Company with max stock price: " + maxCompanyStream);

        // ==============================
        // Problem 2: Tính giá trung bình
        // ==============================
        System.out.println("\n=== Problem 2: Average Stock Price ===");

        // Cách 1: Classic
        Collection<Integer> values = stockPrice.values();
        long sum = 0;
        for (int v : values) {
            sum += v;
        }
        double avg = (double) sum / values.size();
        System.out.println("[Classic] Average stock price: " + avg);

        // Cách 2: Java 8+
        double avgStream = stockPrice.values()
            .stream()
            .mapToInt(Integer::intValue)
            .average()
            .orElse(0.0);
        System.out.println("[Java 8+] Average stock price: " + avgStream);

        // ==============================
        // Problem 3: Xóa công ty có giá < 50
        // ==============================
        System.out.println("\n=== Problem 3: Remove companies with stock price < 50 ===");

        // Copy map để làm riêng cho mỗi cách
        Map<String, Integer> mapClassic = new HashMap<>(stockPrice);
        Map<String, Integer> mapStream = new HashMap<>(stockPrice);

        // Cách 1: Classic (Iterator)
        Iterator<Map.Entry<String, Integer>> itr = mapClassic.entrySet().iterator();
        while (itr.hasNext()) {
            if (itr.next().getValue() < 50) {
                itr.remove();
            }
        }
        System.out.println("[Classic] After removal: " + mapClassic);

        // Cách 2: Java 8+ (removeIf)
        mapStream.entrySet().removeIf(e -> e.getValue() < 50);
        System.out.println("[Java 8+] After removal: " + mapStream);
    }
}

