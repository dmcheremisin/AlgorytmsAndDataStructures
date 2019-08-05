package com.algorithms.data.structures.hashtables.chaining;

import com.algorithms.data.structures.hashtables.StoredEmployee;
import com.algorithms.data.structures.model.Employee;
import org.apache.commons.collections4.CollectionUtils;

import java.util.LinkedList;
import java.util.ListIterator;

public class ChainedHashTable {
    private static final int DEFAULT_LENGTH = 10;

    private LinkedList<StoredEmployee>[] hashTable;

    public ChainedHashTable() {
        hashTable = new LinkedList[DEFAULT_LENGTH];
        for(int i = 0; i < DEFAULT_LENGTH; i++) {
            hashTable[i] = new LinkedList<>();
        }
    }

    private int hashKey(String key) {
        return key.length() % hashTable.length;
    }

    private StoredEmployee findStoredEmployee(String key) {
        int hashedKey = hashKey(key);
        LinkedList<StoredEmployee> storedEmployees = hashTable[hashedKey];
        return storedEmployees.stream()
                .filter(s -> s.getKey().equals(key))
                .findFirst()
                .orElse(null);
    }

    public Employee get(String key) {
        StoredEmployee foundEmployee = findStoredEmployee(key);
        return foundEmployee == null ? null : foundEmployee.getEmployee();
    }

    public void put(String key, Employee employee) {
        int hashedKey = hashKey(key);
        LinkedList<StoredEmployee> storedEmployees = hashTable[hashedKey];
        StoredEmployee foundEmployee = findStoredEmployee(key);
        if(foundEmployee != null) {
            remove(key);
        }
        storedEmployees.add(new StoredEmployee(key, employee));
    }

    public Employee remove(String key) {
        int hashedKey = hashKey(key);
        LinkedList<StoredEmployee> storedEmployees = hashTable[hashedKey];
        StoredEmployee storedEmployee = null;
        ListIterator<StoredEmployee> storedEmployeeListIterator = storedEmployees.listIterator();
        while(storedEmployeeListIterator.hasNext()){
            storedEmployee = storedEmployeeListIterator.next();
            if(storedEmployee.getKey().equals(key)){
                storedEmployeeListIterator.remove();
                break;
            }
        }
        return storedEmployee == null ? null : storedEmployee.getEmployee();
    }


    public void printHashTable() {
        for (int i = 0; i < hashTable.length; i++) {
            LinkedList<StoredEmployee> storedEmployees = hashTable[i];
            System.out.print(i + ": ");
            if(CollectionUtils.isNotEmpty(storedEmployees)) {
                for (StoredEmployee storedEmployee : storedEmployees) {
                    System.out.print(storedEmployee + " -> ");
                }
            }
            System.out.println();
        }

    }

}
