package com.algorithms.data.structures.sortAlgorithms;

import java.util.Arrays;

public class RadixSort {

    public static void main(String[] args) {
        int[] radixArray = { 4725, 4586, 1330, 8792, 1594, 5729};

        radixSort(radixArray, 10, 4);

        System.out.println(Arrays.toString(radixArray));
    }

    private static void radixSort(int[] input, int radix, int width) {
        for(int i = 0; i < width; i++) {
            int divider = (int) Math.pow(10, i);
            radixSingleSort(input, divider, radix);
        }
    }

    private static void radixSingleSort(int[] input, int divider, int radix) {
        int numItems = input.length;
        int[] countArray = new int[radix];

        for(int value : input) {
            countArray[getDigit(divider, value, radix)]++;
        }

        for(int j = 1; j < radix; j++) {
            countArray[j] += countArray[j - 1];
        }

        int[] temp = new int[numItems];
        for(int tempIndex = numItems - 1; tempIndex >= 0; tempIndex--) {
            int digit = getDigit(divider, input[tempIndex], radix);
            temp[--countArray[digit]] = input[tempIndex];
        }

        System.arraycopy(temp, 0, input, 0, numItems);
    }

    private static int getDigit(int divider, int value, int radix) {
        return value / divider % radix;
    }

}
