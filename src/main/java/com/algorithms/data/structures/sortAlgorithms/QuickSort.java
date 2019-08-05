package com.algorithms.data.structures.sortAlgorithms;

import static com.algorithms.data.structures.sortAlgorithms.Utils.printArr;
import static com.algorithms.data.structures.sortAlgorithms.Utils.swap;

/**
 * Created by Dmitrii on 09.05.2019.
 */
public class QuickSort {

    public static void main(String[] args) {
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        sort(intArray, 0, intArray.length-1);

        printArr(intArray);
    }

    public static void sort(int arr[], int low, int high) {
        if (low < high) {
            // pivot is partitioning index, arr[pivot] is now at right place
            int pivot = partition(arr, low, high);

            // Recursively sort elements before partition and after partition
            sort(arr, low, pivot - 1);
            sort(arr, pivot + 1, high);
        }
    }

    public static int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = (low - 1); // index of smaller element

        for (int j = low; j < high; j++) {
            // if current element is smaller than or equal to pivot
            if (arr[j] <= pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return i + 1;
    }
}
