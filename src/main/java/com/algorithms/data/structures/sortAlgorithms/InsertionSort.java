package com.algorithms.data.structures.sortAlgorithms;

import static com.algorithms.data.structures.sortAlgorithms.Utils.printArr;

public class InsertionSort {


    public static void main(String[] args) {
        int[] arr = {45, 35, -15, 7, 55, 1, -22};

        for (int firstUnsorted = 1; firstUnsorted < arr.length; firstUnsorted++){
            int elem = arr[firstUnsorted];
            int i;
            for(i = firstUnsorted; i > 0 && arr[i - 1] > elem; i--){
                arr[i] = arr[i-1];
            }
            arr[i] = elem;
        }

        printArr(arr);
        /*
        >>>>>> Result:
        -22
        -15
        1
        7
        35
        45
        55
         */
    }
}
