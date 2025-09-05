package com.lqhuy03.jfp.collections.l03_arraylist_iteration;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(34);
        list.add(45);

        // ✅ Thêm phần tử TRƯỚC khi tạo iterator
        list.add(54);

        Iterator<Integer> itr = list.iterator();
        while (itr.hasNext()) {
            Integer x = itr.next();
            if (x == 30) {
                // ✅ Xoá an toàn khi đang iterate
                itr.remove();
            }
        }

        System.out.println(list); // [34, 45, 54]
    }
}
