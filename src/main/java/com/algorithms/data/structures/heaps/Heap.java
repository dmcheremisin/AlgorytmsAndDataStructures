package com.algorithms.data.structures.heaps;

public class Heap {
    private Integer[] heap;
    private int size;

    public Heap(int size) {
        this.heap = new Integer[size];
    }

    private void fixHeapAbove(int index) {
        Integer value = heap[index];
        while (index > 0 && value > heap[getParentIndex(index)]) {
            heap[index] = heap[getParentIndex(index)];
            index = getParentIndex(index);
        }
        heap[index] = value;
    }

    private int getParentIndex(int index) {
        return (index - 1) / 2;
    }

    public boolean isFull() {
        return size == heap.length;
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
        for (Integer integer : heap) {
            System.out.print(integer + ", ");
        }
        System.out.println();

    }

}
