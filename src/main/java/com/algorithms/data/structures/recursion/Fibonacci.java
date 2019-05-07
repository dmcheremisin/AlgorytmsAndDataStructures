package com.algorithms.data.structures.recursion;

public class Fibonacci {

    public static void main(String[] args) {
        System.out.println(fiboIterative(7)); // 13
        System.out.println(fiboRecursive(7)); // 13
    }

    // f0 = 0
    // f1 = 1
    // f2 = 1 = 1 + 0
    // f3 = 2 = 1 + 1 = 1 + 1 + 0
    // f4 = 3 = 2 + 1 = 1 + 1 + 0 + 1 + 0
    // f5 = 5 = 3 + 2 = 1 + 1 + 0 + 1 + 0 + 1 + 1 + 0
    // f(n) = f(n - 1) + f(n - 2)

    public static int fiboRecursive(int num) {
        if(num <= 1) return num;
        return fiboRecursive(num - 1) + fiboRecursive(num - 2);
    }

    public static int fiboIterative(int num) {
        if (num == 0) return 0;

        int counter = 1;
        int n1 = 0;
        int n2 = 1;
        int result = 1;
        while (counter < num) {
            result = n1 + n2;
            n1 = n2;
            n2 = result;
            counter++;
        }
        return result;
    }
}
