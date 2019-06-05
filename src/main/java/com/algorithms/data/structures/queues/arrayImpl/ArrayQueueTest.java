package com.algorithms.data.structures.queues.arrayImpl;

import com.algorithms.data.structures.model.Employee;

/**
 * Created by Dmitrii on 05.06.2019.
 */
public class ArrayQueueTest {

    public static void main(String[] args) {
        Employee johnSnow = new Employee(25, "John", "Snow");
        Employee dainerisTargarien = new Employee(38, "Daineris", "Targarien");
        Employee tyronLannister = new Employee(41, "Tyron", "Lannister");
        Employee cerseiLannister = new Employee(43, "Cersei", "Lannister");
        Employee sansaStark = new Employee(43, "Sansa", "Stark");

        ArrayQueue queue = new ArrayQueue(3);
        queue.add(johnSnow);
        queue.add(dainerisTargarien);
        queue.add(tyronLannister);
        queue.add(cerseiLannister);

        System.out.println(queue.size()); // 4
        System.out.println(queue.peek()); // Employee{id=25, firstName='John', lastName='Snow'}

        System.out.println(queue.remove()); // Employee{id=25, firstName='John', lastName='Snow'}
        System.out.println(queue.size()); // 3

        queue.add(sansaStark);
        System.out.println(queue.peek()); // Employee{id=38, firstName='Daineris', lastName='Targarien'}
        System.out.println(queue.size()); // 4

        queue.printQueue();
//        Employee{id=38, firstName='Daineris', lastName='Targarien'}
//        Employee{id=41, firstName='Tyron', lastName='Lannister'}
//        Employee{id=43, firstName='Cersei', lastName='Lannister'}
//        Employee{id=43, firstName='Sansa', lastName='Stark'}
    }
}
