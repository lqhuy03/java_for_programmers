package com.lqhuy03.jfp.collections.l24_collection_threadsafe;

import java.util.*;

public class SynchronizedCollectionsDemo {

    public static void main(String[] args) throws InterruptedException {
        // 1) Biến ArrayList hiện có thành thread-safe List
        List<Integer> rawList = new ArrayList<>();
        Collections.addAll(rawList, 1, 2, 3, 4, 5);

        List<Integer> syncList = Collections.synchronizedList(rawList);

        // 2) Biến HashMap/HashSet thành thread-safe Map/Set
        Map<String, Integer> rawMap = new HashMap<>();
        rawMap.put("A", 10); rawMap.put("B", 20);
        Map<String, Integer> syncMap = Collections.synchronizedMap(rawMap);

        Set<String> rawSet = new HashSet<>(Arrays.asList("x", "y", "z"));
        Set<String> syncSet = Collections.synchronizedSet(rawSet);

        // 3) Demo cập nhật đồng thời (2 thread) vào syncList
        Thread t1 = new Thread(() -> {
            for (int i = 6; i <= 10; i++) syncList.add(i);
        });
        Thread t2 = new Thread(() -> {
            for (int i = 11; i <= 15; i++) syncList.add(i);
        });
        t1.start(); t2.start();
        t1.join(); t2.join();

        // 4) DUYỆT MỘT LIST ĐÃ ĐỒNG BỘ: phải khóa thủ công khi iterate
        // (vì Iterator bản thân nó không tự đồng bộ)
        synchronized (syncList) {
            System.out.println("syncList contents: " + syncList);
        }

        // 5) Với Map/Set, cũng nên khóa khi iterate
        synchronized (syncMap) {
            System.out.println("syncMap entries: " + syncMap);
        }
        synchronized (syncSet) {
            System.out.println("syncSet entries: " + syncSet);
        }

        // 6) Ví dụ synchronizedSortedMap / synchronizedSortedSet
        SortedMap<Integer,String> treeMap = new TreeMap<>();
        treeMap.put(2,"two"); treeMap.put(1,"one");
        SortedMap<Integer,String> syncSortedMap = Collections.synchronizedSortedMap(treeMap);

        SortedSet<Integer> treeSet = new TreeSet<>(Arrays.asList(3,1,2));
        SortedSet<Integer> syncSortedSet = Collections.synchronizedSortedSet(treeSet);

        synchronized (syncSortedMap) {
            System.out.println("syncSortedMap: " + syncSortedMap);
        }
        synchronized (syncSortedSet) {
            System.out.println("syncSortedSet: " + syncSortedSet);
        }
    }
}
