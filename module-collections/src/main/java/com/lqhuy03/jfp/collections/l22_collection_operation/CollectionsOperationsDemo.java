package com.lqhuy03.jfp.collections.l22_collection_operation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsOperationsDemo {

    public static void main(String[] args) {
        // 1️⃣ TÌM KIẾM PHẦN TỬ TRONG LIST (binarySearch)
        List<Integer> sortedList = new ArrayList<>();
        sortedList.add(9);
        sortedList.add(12);
        sortedList.add(34);
        sortedList.add(54);
        sortedList.add(66);
        sortedList.add(76);

        int searchKey = 54;
        int position = Collections.binarySearch(sortedList, searchKey);
        System.out.println("Vị trí của " + searchKey + " trong sortedList: " + position);

        // Nếu phần tử không tồn tại
        int notFoundKey = 222;
        int insertionPoint = Collections.binarySearch(sortedList, notFoundKey);
        System.out.println("Kết quả tìm kiếm " + notFoundKey + ": " + insertionPoint +
            " (giá trị âm = không tồn tại, có thể chèn tại vị trí " + (-insertionPoint - 1) + ")");

        // 2️⃣ SAO CHÉP DANH SÁCH (copy)
        List<Integer> destList = new ArrayList<>();
        Collections.addAll(destList, 10, 20, 30, 40, 50, 60);
        List<Integer> srcList = new ArrayList<>();
        Collections.addAll(srcList, 1, 2, 3);

        Collections.copy(destList, srcList); // Sao chép src → dest
        System.out.println("Dest list sau khi copy: " + destList);

        // 3️⃣ GÁN GIÁ TRỊ MẶC ĐỊNH CHO LIST (fill)
        Collections.fill(destList, 100);
        System.out.println("Dest list sau khi fill giá trị 100: " + destList);
    }
}

