package com.algorythms.data.structures.sortAlgorithms;

import static com.algorythms.data.structures.sortAlgorithms.Utils.swap;

public class SelectionSort {

    public static void main(String[] args) {
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        for (int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            int largest = 0;
            for(int i = 1; i <= lastUnsortedIndex; i++) {
                if(intArray[i] > intArray[largest]) {
                    largest = i;
                }
            }
            swap(intArray, largest, lastUnsortedIndex);
        }

        System.out.println(">>>>>> Result: ");
        for (int i : intArray) {
            System.out.println(i);
        }
        /*
        >>>>>> Result:
        -22
        -15
        1
        7
        20
        35
        55
        */
    }
}