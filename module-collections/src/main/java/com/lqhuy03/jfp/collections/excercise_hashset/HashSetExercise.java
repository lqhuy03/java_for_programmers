package com.lqhuy03.jfp.collections.excercise_hashset;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetExercise {
    public static void main(String args[]) {
        Set<Integer> set = new HashSet<>();
        int[] data = {12, 34, 1, 56, 43, 34, 65};
        int duplicate = 0;

        for(int i : data){
            if(!set.add(i)){
                duplicate = i;
                break;
            }
        }

        System.out.println(duplicate);
    }
}

