package com.algorithms.data.structures.heaps;

public class Heap {
    private Integer[] heap;
    private int size;

    public Heap(int size) {
        this.heap = new Integer[size];
    }

    private void fixHeapAbove(int index) {
        Integer value = heap[index];
        while (index > 0 && value > heap[getParent(index)]) {
            heap[index] = heap[getParent(index)];
            index = getParent(index);
        }
        heap[index] = value;
    }

    private int getParent(int index) {
        return (index - 1) / 2;
    }

    private int getChild(int index, boolean left) {
        return 2 * index + (left ? 1 : 2);
    }

    public boolean isFull() {
        return size == heap.length;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int delete(int index) {
        if(isEmpty()) {
            throw new IndexOutOfBoundsException("Heap is empty");
        }

        int parent = getParent(index);
        int deletedValue = heap[index];

        heap[index] = heap[size - 1];

        if(index == 0 || heap[index] < heap[parent]) {
            fixHeapBelow(index, size - 1);
        } else {
            fixHeapAbove(index);
        }

        size--;
        return deletedValue;
    }

    private void fixHeapBelow(int index, int lastHeapIndex) {
        int childToSwap;

        while(index <= lastHeapIndex) {
            int leftChild = getChild(index, true);
            int rightChild = getChild(index, false);
            if(leftChild <= lastHeapIndex) {
                if(rightChild > lastHeapIndex) {
                    childToSwap = leftChild;
                }
                else {
                    childToSwap = heap[leftChild] > heap[rightChild] ? leftChild : rightChild;
                }

                if(heap[index] < heap[childToSwap]) {
                    int tmp = heap[index];
                    heap[index] = heap[childToSwap];
                    heap[childToSwap] = tmp;
                } else {
                    break;
                }
                index = childToSwap;
            }
            else {
                break;
            }
        }
    }

    public void insert(int value) {
        if(isFull()) {
            throw new IndexOutOfBoundsException("Heap is full");
        }
        heap[size] = value;

        fixHeapAbove(size);
        size++;
    }

    public void printHeap() {
        for (int i = 0; i < size; i++) {
            System.out.print(heap[i] + ", ");
        }
        System.out.println();

    }

}
