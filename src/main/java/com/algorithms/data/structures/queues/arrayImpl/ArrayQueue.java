package com.algorithms.data.structures.queues.arrayImpl;

import com.algorithms.data.structures.model.Employee;

import java.util.NoSuchElementException;

/**
 * Created by Dmitrii on 05.06.2019.
 */
public class ArrayQueue {

    private Employee[] employees;
    private int front;
    private int back;

    public ArrayQueue(int size) {
        employees = new Employee[size];
    }

    public int size() {
        return back - front;
    }

    public void add(Employee employee) {
        int employeesLength = employees.length;
        if(employeesLength == back) {
            Employee[] newEmployee = new Employee[employeesLength * 2];
            System.arraycopy(employees, 0, newEmployee, 0, employeesLength);
            employees = newEmployee;
        }
        employees[back++] = employee;
    }

    public Employee remove() {
        checkQueue();
        Employee employee = employees[front++];
        if(size() == 0){
            front = back = 0;
        }
        return employee;
    }

    public Employee peek() {
        return employees[front];
    }

    public void printQueue() {
        for(int i = front; i < back; i++) {
            System.out.println(employees[i]);
        }
    }

    private void checkQueue() {
        if(size() == 0){
            throw new NoSuchElementException();
        }
    }


}
