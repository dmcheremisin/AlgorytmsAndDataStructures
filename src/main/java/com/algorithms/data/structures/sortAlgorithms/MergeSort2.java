package com.algorithms.data.structures.sortAlgorithms;

import static com.algorithms.data.structures.sortAlgorithms.Utils.printArr;

public class MergeSort2 {

    public static void main(String[] args) {
        int[] arr = {20, 35, -15, 7, 55, 1, -22};

        mergeSort(arr);

        printArr(arr); // [-22, -15, 1, 7, 20, 35, 55]
    }

    private static void mergeSort(int[] arr) {
        int length = arr.length;
        if(length < 2) {
            return;
        }

        int mid = length / 2;
        int[] left = new int[mid];
        int[] right = new int[length - mid];
        System.arraycopy(arr, 0, left, 0, mid);
        System.arraycopy(arr, mid, right, 0, length - mid);
        mergeSort(left);
        mergeSort(right);

        merge(arr, left, right);
    }

    private static void merge(int[] arr, int[] left, int[] right) {
        int i = 0 , j = 0, k = 0, leftLen = left.length, rightLen = right.length;

        while (i < leftLen && j < rightLen) {
            arr[k++] = left[i] < right[j] ? left[i++] : right[j++];
        }
        while (i < leftLen) {
            arr[k++] = left[i++];
        }
        while (j < rightLen) {
            arr[k++] = right[j++];
        }
    }

}
