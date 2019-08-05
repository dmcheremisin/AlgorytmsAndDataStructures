package com.algorithms.data.structures.search;

public class BinarySearch {
    public static void main(String[] args) {
        int[] intArray = {-22, -15, 1, 13, 27, 45, 55};

        System.out.println(iterativeBinarySearch(intArray, -15));
        System.out.println(iterativeBinarySearch(intArray, 1));
        System.out.println(iterativeBinarySearch(intArray, 8888));
        System.out.println(iterativeBinarySearch(intArray, 55));

        System.out.println(recursiveBinarySearch(intArray, -15));
        System.out.println(recursiveBinarySearch(intArray, 1));
        System.out.println(recursiveBinarySearch(intArray, 8888));
        System.out.println(recursiveBinarySearch(intArray, 55));
    }

    private static int recursiveBinarySearch(int[] intArray, int search) {
        return recursiveMethod(intArray, 0, intArray.length - 1, search);
    }

    private static int recursiveMethod(int[] intArray, int start, int end, int search) {
        if (start > end) {
            return -1;
        }
        int midPoint = (start + end) / 2;
        int midValue = intArray[midPoint];
        if (midValue == search) {
            return midPoint;
        } else if (search > midValue) {
            return recursiveMethod(intArray, midPoint + 1, end, search);
        } else {
            return recursiveMethod(intArray, start, midPoint, search);
        }
    }

    private static int iterativeBinarySearch(int[] intArray, int search) {
        int start = 0;
        int end = intArray.length;

        while (start < end) {
            int midPoint = (start + end) / 2;
            int midValue = intArray[midPoint];
            if (midValue == search) {
                return midPoint;
            } else if (search > midValue) {
                start = midPoint + 1;
            } else {
                end = midPoint;
            }
        }
        return -1;
    }


}
