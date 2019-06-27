package com.algorithms.data.structures.heaps;

public class HeapTest {

    public static void main(String[] args) {

        Heap heap = new Heap(8);
        heap.insert(80);
        heap.insert(75);
        heap.insert(60);
        heap.insert(68);
        heap.insert(55);
        heap.insert(40);
        heap.insert(52);
        heap.insert(67);

        System.out.println(heap.peek()); // 80
        heap.printHeap(); // 80, 75, 60, 68, 55, 40, 52, 67,

//        heap.delete(1);
//        heap.printHeap(); // 80, 68, 60, 67, 55, 40, 52,

        heap.delete(0);
        heap.printHeap(); // 75, 68, 60, 67, 55, 40, 52,
        System.out.println(heap.peek()); // 75

        heap.sort();
        heap.printHeap(); // 40, 52, 55, 60, 67, 68, 75,
    }

}
