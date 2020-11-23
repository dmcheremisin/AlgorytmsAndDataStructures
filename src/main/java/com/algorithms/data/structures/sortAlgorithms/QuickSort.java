package com.algorithms.data.structures.sortAlgorithms;

import static com.algorithms.data.structures.sortAlgorithms.Utils.printArr;
import static com.algorithms.data.structures.sortAlgorithms.Utils.swap;

/**
 * Created by Dmitrii on 09.05.2019.
 */
public class QuickSort {

    public static void main(String[] args) {
        int[] intArray = {18 ,1 ,8 ,3 ,2 ,7 ,11 ,4 ,10 ,13 ,19 ,15 ,6 ,5 ,12 ,16 ,0 ,14 ,17 ,9};

        sort(intArray, 0, intArray.length-1);

        printArr(intArray);
    }

    public static void sort(int arr[], int begin, int end) {
        if (begin < end) {
            // pivot is partitioning index, arr[pivot] is now at right place
            int pivot = partition(arr, begin, end);

            // Recursively sort elements before partition and after partition
            sort(arr, begin, pivot - 1);
            sort(arr, pivot + 1, end);
        }
    }

    private static int partition(int arr[], int begin, int end) {
        int pivot = arr[end];
        int i = (begin - 1);

        for (int j = begin; j < end; j++) {
            if (arr[j] <= pivot)
                swap(arr, ++i, j);
        }
        swap(arr, ++i, end);
        return i;
    }
}
