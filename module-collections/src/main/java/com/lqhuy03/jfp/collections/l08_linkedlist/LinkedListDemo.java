package com.lqhuy03.jfp.collections.l08_linkedlist;

import java.util.*;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.add(1);              // [1]
        linkedList.add(2);              // [1, 2]
        linkedList.addLast(3);          // [1, 2, 3]
        System.out.println(linkedList);

        linkedList.addFirst(10);        // [10, 1, 2, 3]
        System.out.println(linkedList);

        linkedList.add(2, 20);          // [10, 1, 20, 2, 3]
        System.out.println(linkedList);

        List<Integer> list = new ArrayList<>();
        list.add(101); list.add(102); list.add(103);

        linkedList.addAll(3, list);     // Chèn vào vị trí 3
        System.out.println(linkedList);
    }
}

