package com.algorithms.data.structures.hashtables.simple;

import com.algorithms.data.structures.model.Employee;

public class SimpleHashTable {

    private Employee[] hashtable;

    public SimpleHashTable() {
        this.hashtable = new Employee[10];
    }

    public void put(String key, Employee employee) {
        int hashedKey = hash(key);
        if(hashtable[hashedKey] != null ) {
            System.out.println("There is already an employee at the position = " + hashedKey + " with key = " + key );
        } else {
            hashtable[hashedKey] = employee;
        }
    }

    public Employee get(String key) {
        int hashedKey = hash(key);
        return hashtable[hashedKey];
    }

    private int hash(String key) {
        return key.length() % hashtable.length;
    }

    public void printHashTable() {
        for (Employee employee : hashtable) {
            System.out.println(employee);
        }

    }
}
