package com.algorithms.data.structures.hashtables.lineProbing;

import com.algorithms.data.structures.model.Employee;

public class StoredEmployee {

    public String key;
    public Employee employee;

    public StoredEmployee(String key, Employee employee) {
        this.key = key;
        this.employee = employee;
    }
}
