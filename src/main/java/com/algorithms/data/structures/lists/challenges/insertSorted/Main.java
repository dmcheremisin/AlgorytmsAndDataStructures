package com.algorithms.data.structures.lists.challenges.insertSorted;

public class Main {

    public static void main(String[] args) {

        Integer one = 1;
        Integer two = 2;
        Integer three = 3;
        Integer four = 4;

        IntegerLinkedList list = new IntegerLinkedList();
        list.insertSortedFromSolution(three);
        list.printList();
        list.insertSortedFromSolution(two);
        list.printList();
        list.insertSortedFromSolution(one);
        list.printList();
        list.insertSortedFromSolution(four);
        list.printList();

//        HEAD -> 3 -> null
//        HEAD -> 2 -> 3 -> null
//        HEAD -> 1 -> 2 -> 3 -> null
//        HEAD -> 1 -> 2 -> 3 -> 4 -> null
    }
}
