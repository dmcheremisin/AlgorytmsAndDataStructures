package com.algorithms.data.structures.sortAlgorithms;

import java.util.Arrays;

public class Utils {
    public static void swap(int[] array, int i, int j) {
        if(i == j){
            return;
        }
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void printArr(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }
}
