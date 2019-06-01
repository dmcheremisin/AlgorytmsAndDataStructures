package com.algorithms.data.structures.stacks.linkedListStack;

import com.algorithms.data.structures.model.Employee;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by Dmitrii on 01.06.2019.
 */
public class LinkedListStack {
    private LinkedList<Employee> stack;

    public LinkedListStack() {
        stack = new LinkedList<>();
    }

    public void push(Employee employee) {
        stack.push(employee);
    }

    public Employee pop() {
        return stack.pop();
    }

    public Employee peek() {
        return stack.peek();
    }

    public int size() {
        return stack.size();
    }

    public void printStack() {
        Iterator<Employee> iterator = stack.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
