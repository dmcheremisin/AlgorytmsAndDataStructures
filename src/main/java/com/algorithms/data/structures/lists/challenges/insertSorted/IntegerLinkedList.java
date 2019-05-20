package com.algorithms.data.structures.lists.challenges.insertSorted;

public class IntegerLinkedList {

    private IntegerNode head;
    private int size;

    public void addToFront(Integer value) {
        IntegerNode node = new IntegerNode(value);
        node.setNext(head);
        head = node;
        size++;
    }

    public IntegerNode removeFromFront() {
        if (isEmpty()) {
            return null;
        }

        IntegerNode removedNode = head;
        head = head.getNext();
        size--;
        removedNode.setNext(null);
        return removedNode;
    }

    public void insertSorted(Integer value) {
        IntegerNode integerNode = new IntegerNode(value);

        if (head == null){
            head = integerNode;
        } else {

            IntegerNode current = head;
            IntegerNode previous = null;

            while (current.getNext() != null && current.getValue() != null && current.getValue() < value) {
                previous = current;
                current = current.getNext();
            }

            if(current.getValue() < value) {
                current.setNext(integerNode);
            } else if (previous == null) {
                integerNode.setNext(head);
                head = integerNode;
            } else {
                previous.setNext(integerNode);
                integerNode.setNext(current);
            }
        }
        size++;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void printList() {
        IntegerNode current = head;
        System.out.print("HEAD -> ");
        while (current != null) {
            System.out.print(current);
            System.out.print(" -> ");
            current = current.getNext();
        }
        System.out.println("null");
    }

}
