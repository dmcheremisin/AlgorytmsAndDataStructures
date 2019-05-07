package com.algorithms.data.structures.sortAlgorithms;

import static com.algorithms.data.structures.sortAlgorithms.Utils.swap;

public class BubleSort {

    public static void main(String[] args) {
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        for(int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--){
            for(int i = 0; i < lastUnsortedIndex; i++){
                if(intArray[i] > intArray[i+1]) {
                    System.out.printf("Swapping %s and %s \n", intArray[i], intArray[i+1]);
                    swap(intArray, i , i + 1);
                }
            }
        }
        System.out.println(">>>>>> Result: ");
        for (int i : intArray) {
            System.out.println(i);
        }

        /*
        Swapping 35 and -15
        Swapping 35 and 7
        Swapping 55 and 1
        Swapping 55 and -22
        Swapping 20 and -15
        Swapping 20 and 7
        Swapping 35 and 1
        Swapping 35 and -22
        Swapping 20 and 1
        Swapping 20 and -22
        Swapping 7 and 1
        Swapping 7 and -22
        Swapping 1 and -22
        Swapping -15 and -22
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
