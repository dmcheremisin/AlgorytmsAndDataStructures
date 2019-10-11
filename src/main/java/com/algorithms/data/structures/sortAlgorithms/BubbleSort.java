package com.algorithms.data.structures.sortAlgorithms;

import static com.algorithms.data.structures.sortAlgorithms.Utils.printArr;
import static com.algorithms.data.structures.sortAlgorithms.Utils.swap;

public class BubbleSort {

    public static void main(String[] args) {
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        bubbleSort2(intArray);
        printArr(intArray);
    }

    private static void bubbleSort(int[] intArray) {
        printArr(intArray);
        for(int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--){
            for(int i = 0; i < lastUnsortedIndex; i++){
                if(intArray[i] > intArray[i+1]) {
                    swap(intArray, i , i + 1);
                }
            }
            printArr(intArray);
        }
    }
    //[20, 35, -15, 7, 55, 1, -22]
    //[20, -15, 7, 35, 1, -22, 55]
    //[-15, 7, 20, 1, -22, 35, 55]
    //[-15, 7, 1, -22, 20, 35, 55]
    //[-15, 1, -22, 7, 20, 35, 55]
    //[-15, -22, 1, 7, 20, 35, 55]
    //[-22, -15, 1, 7, 20, 35, 55]
    //[-22, -15, 1, 7, 20, 35, 55]

    private static void bubbleSort2(int[] intArray) {
        printArr(intArray);

        int lastIndex = intArray.length - 1;
        for(int i = 0; i < lastIndex; i++) {
            for(int j = 0; j < lastIndex - i; j++) {
                if(intArray[j] > intArray[j + 1]) {
                    swap(intArray, j, j + 1);
                }
            }
            printArr(intArray);
        }
    }

    //[20, 35, -15, 7, 55, 1, -22]
    //[20, -15, 7, 35, 1, -22, 55]
    //[-15, 7, 20, 1, -22, 35, 55]
    //[-15, 7, 1, -22, 20, 35, 55]
    //[-15, 1, -22, 7, 20, 35, 55]
    //[-15, -22, 1, 7, 20, 35, 55]
    //[-22, -15, 1, 7, 20, 35, 55]
    //[-22, -15, 1, 7, 20, 35, 55]
}
