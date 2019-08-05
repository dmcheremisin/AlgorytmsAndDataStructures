package com.algorithms.data.structures.stacks.arrayStack;

import com.algorithms.data.structures.model.Employee;

/**
 * Created by Dmitrii on 28.05.2019.
 */
public class ArrayStack {
    private Employee[] data;
    private int position;

    public ArrayStack(int size) {
        this.data = new Employee[size];
        position = 0;
    }

    public int size() {
        return data.length;
    }

    public boolean push(Employee employee) {
        if(position >= data.length) {
            Employee[] newData = new Employee[data.length * 2];
            System.arraycopy(data, 0, newData, 0, data.length);
            data = newData;
            System.out.println("Array is resized to size: " + data.length);
        }
        data[position++] = employee;
        return true;
    }

    public Employee pop() {
        checkState();
        Employee employee = data[--position];
        data[position] = null;
        return employee;
    }

    public Employee peek() {
        checkState();
        return data[position - 1];
    }

    private void checkState() {
        if(position <= 0)
            throw new IllegalStateException("The stack is empty");
    }

}
