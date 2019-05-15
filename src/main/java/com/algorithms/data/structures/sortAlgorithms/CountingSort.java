package com.algorithms.data.structures.sortAlgorithms;

import java.util.Arrays;

public class CountingSort {

    public static void main(String[] args) {
        int[] intArray = { 2, 5, 9, 8, 2, 8, 7, 10, 4, 3};

        countingSort(intArray, 1, 10);

        System.out.println(Arrays.toString(intArray)); //[2, 2, 3, 4, 5, 7, 8, 8, 9, 10]

    }

    public static void countingSort(int[] input, int min, int max) {
        int[] countArray = new int[(max - min) + 1];

        for(int i = 0; i < input.length; i++) {
            countArray[input[i] - min]++;
        }
        int j = 0;
        for(int i = 0; i < countArray.length; i++) {
            while(countArray[i] > 0){
                input[j] = i + min;
                countArray[i]--;
                j++;
            }
        }
    }
}
