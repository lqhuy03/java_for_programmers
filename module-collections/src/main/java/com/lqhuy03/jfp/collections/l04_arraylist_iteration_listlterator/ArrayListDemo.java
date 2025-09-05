package com.lqhuy03.jfp.collections.l04_arraylist_iteration_listlterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        ListIterator<Integer> itr = list.listIterator();

        // Forward iteration
        System.out.println("Forward:");
        while (itr.hasNext()) {
            System.out.println("Next: " + itr.next() +
                ", Next index: " + itr.nextIndex());
        }

        // Backward iteration
        System.out.println("Backward:");
        while (itr.hasPrevious()) {
            System.out.println("Previous: " + itr.previous() +
                ", Previous index: " + itr.previousIndex());
        }
    }
}
