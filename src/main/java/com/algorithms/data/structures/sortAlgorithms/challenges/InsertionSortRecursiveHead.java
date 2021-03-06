package com.algorithms.data.structures.sortAlgorithms.challenges;

import java.util.Arrays;

public class InsertionSortRecursiveHead {


    public static void main(String[] args) {
        int[] arr = {45, 35, -15, 7, 55, 1, -22};

        recursiveInsert(arr, arr.length - 1);

        System.out.println(Arrays.toString(arr));
    }

    private static void recursiveInsert(int[] arr, int firstUnsorted) {
        if(firstUnsorted < 1) return;

        recursiveInsert(arr, firstUnsorted - 1);

        int elem = arr[firstUnsorted];
        int i;
        for(i = firstUnsorted; i > 0 && arr[i - 1] > elem; i--){
            arr[i] = arr[i-1];
        }
        arr[i] = elem;


    }

}
