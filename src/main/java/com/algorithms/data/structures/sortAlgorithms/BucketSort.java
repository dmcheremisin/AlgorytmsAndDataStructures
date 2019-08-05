package com.algorithms.data.structures.sortAlgorithms;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class BucketSort {

    public static void main(String[] args) {
        int[] intArray = {56, 46, 83, 66, 95, 92, 43};

        bucketSort(intArray);

        for (int value : intArray) {
            System.out.println(value);
        }
//        43
//        46
//        56
//        66
//        83
//        92
//        95
    }

    private static void bucketSort(int[] intArray) {
        List<Integer>[] list = new List[10];

        for (int j = 0; j < 10; j++) {
            //list[j] = new ArrayList<>();
            list[j] = new LinkedList<>();
        }

        for (int i : intArray) {
            int hashed = hash(i);
            list[hashed].add(i);
        }

        for (List<Integer> integers : list) {
            Collections.sort(integers);
        }

        int i = 0;
        for (List<Integer> integers : list) {
            for (Integer integer : integers) {
                intArray[i++] = integer;
            }
        }
    }

    private static int hash(int value) {
        return value / 10;
    }
}
