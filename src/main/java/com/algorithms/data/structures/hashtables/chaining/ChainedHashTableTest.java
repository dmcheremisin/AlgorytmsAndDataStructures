package com.algorithms.data.structures.hashtables.chaining;

import com.algorithms.data.structures.model.Employee;

public class ChainedHashTableTest {

    public static void main(String[] args) {
        ChainedHashTable ht = new ChainedHashTable();

        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);

        ht.put("Jones", janeJones);
        ht.put("Doe", johnDoe);
        ht.put("Wilson", mikeWilson);
        ht.put("Smith", marySmith);

        ht.printHashTable();

//        0:
//        1:
//        2:
//        3: {key='Doe', employee=Employee{id=4567, firstName='John', lastName='Doe'}} ->
//        4:
//        5: {key='Jones', employee=Employee{id=123, firstName='Jane', lastName='Jones'}} -> {key='Smith', employee=Employee{id=22, firstName='Mary', lastName='Smith'}} ->
//        6: {key='Wilson', employee=Employee{id=3245, firstName='Mike', lastName='Wilson'}} ->
//        7:
//        8:
//        9:

        System.out.println("Retrieve key Wilson: " + ht.get("Wilson")); // Employee{id=3245, firstName='Mike', lastName='Wilson'}
        System.out.println("Retrieve key Smith: " + ht.get("Smith")); // Employee{id=22, firstName='Mary', lastName='Smith'}

        ht.remove("Wilson");
        ht.remove("Jones");
        ht.printHashTable();
//        0:
//        1:
//        2:
//        3: {key='Doe', employee=Employee{id=4567, firstName='John', lastName='Doe'}} ->
//        4:
//        5: {key='Smith', employee=Employee{id=22, firstName='Mary', lastName='Smith'}} ->
//        6:
//        7:
//        8:
//        9:

        System.out.println("Retrieve key Wilson: " + ht.get("Wilson")); // null
    }
}
