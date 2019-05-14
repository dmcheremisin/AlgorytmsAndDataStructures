package com.algorithms.data.structures.sortAlgorithms.challenges;

import java.util.Arrays;

public class RadixSortString {

    public static void main(String[] args) {
        String[] radixArray = { "bcdef", "dbaqc", "abcde", "omadd", "bbbbb"};

        radixSort(radixArray, 25, 5);

        System.out.println(Arrays.toString(radixArray)); // [abcde, bbbbb, bcdef, dbaqc, omadd]
    }

    private static void radixSort(String[] input, int radix, int width) {
        for(int position = width-1; position >= 0; position--) {
            radixSingleSort(input, radix, position);
        }
    }

    private static void radixSingleSort(String[] input, int radix, int position) {
        int numItems = input.length;
        int[] countArray = new int[radix];
        String[] temp = new String[numItems];

        for(String value : input) {
            countArray[getIndex(value, position)]++;
        }

        for(int j = 1; j < radix; j++) {
            countArray[j] += countArray[j - 1];
        }

        for(int i = numItems - 1; i >= 0; i--) {
            String value = input[i];
            int digit = getIndex(value, position);
            int countIndex = --countArray[digit];
            temp[countIndex] = value;
        }

        System.arraycopy(temp, 0, input, 0, numItems);
    }

    private static int getIndex(String value, int position) {
        return value.charAt(position) - 'a';
    }

}
