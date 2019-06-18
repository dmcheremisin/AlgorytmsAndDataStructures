package com.algorithms.data.structures.hashtables.simple;

import com.algorithms.data.structures.model.Employee;

public class SimpleHashTableTest {

    public static void main(String[] args) {
        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
        Employee billEnd = new Employee("Bill", "End", 78);

        SimpleHashTable hashTable = new SimpleHashTable();
        hashTable.put("Jones", johnDoe);
        hashTable.put("Doe", janeJones);
        hashTable.put("Smith", marySmith); // There is already an employee at the position = 5 with key = Smith
        hashTable.put("Wilson", mikeWilson);
        hashTable.put("End", billEnd); // There is already an employee at the position = 3 with key = End

        hashTable.printHashTable();

//        null
//        null
//        null
//        Employee{id=123, firstName='Jane', lastName='Jones'}
//        null
//        Employee{id=4567, firstName='John', lastName='Doe'}
//        Employee{id=3245, firstName='Mike', lastName='Wilson'}
//        null
//        null
//        null
    }
}
