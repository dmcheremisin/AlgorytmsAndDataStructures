package com.algorithms.data.structures.heaps;

public class HeapTest {

    public static void main(String[] args) {

        Heap heap = new Heap(10);
        heap.insert(20);
        heap.insert(12);
        heap.insert(34);
        heap.insert(45);
        heap.insert(10);

        heap.printHeap(); // 45, 34, 20, 12, 10, null, null, null, null, null,
    }
}
