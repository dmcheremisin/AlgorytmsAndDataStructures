package com.algorithms.data.structures.sortAlgorithms;

import static com.algorithms.data.structures.sortAlgorithms.Utils.printArr;
import static com.algorithms.data.structures.sortAlgorithms.Utils.swap;

public class SelectionSort {

    public static void main(String[] args) {
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        selectionSort2(intArray);

        printArr(intArray);
        //[-22, -15, 1, 7, 20, 35, 55]
    }

    private static void selectionSort2(int[] arr) {
        int length = arr.length;
        for(int i = length - 1; i > 0; i--) {
            int biggest = 0;
            for(int j = 1; j <= i; j++){
                if(arr[j] > arr[biggest]) {
                    biggest = j;
                }
            }
            swap(arr, biggest, i);
        }
    }

    private static void selectionSort(int[] intArray) {
        for (int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            int largest = 0;
            for(int i = 1; i <= lastUnsortedIndex; i++) {
                if(intArray[i] > intArray[largest]) {
                    largest = i;
                }
            }
            swap(intArray, largest, lastUnsortedIndex);
        }
    }


}
