package com.algorithms.data.structures.stacks.arrayStack;

import com.algorithms.data.structures.model.Employee;

/**
 * Created by Dmitrii on 30.05.2019.
 */
public class ArrayStackTest {
    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(3);
        // stack.peek(); Exception in thread "main" java.lang.IllegalStateException: The stack is empty

        stack.push(new Employee(0, "Dm", "Ch"));
        System.out.println(stack.peek()); // Employee{id=0, firstName='Dm', lastName='Ch'}

        stack.push(new Employee(1, "An", "Ch"));
        stack.push(new Employee(2, "Ma", "Ch"));
        stack.push(new Employee(2, "Ir", "Ch"));// Array is resized to size: 6

        System.out.println(stack.peek()); // Employee{id=2, firstName='Ir', lastName='Ch'}

        System.out.println(stack.poll()); // Employee{id=2, firstName='Ir', lastName='Ch'}
        System.out.println(stack.peek()); // Employee{id=2, firstName='Ma', lastName='Ch'}

        stack.poll();
        stack.poll();
        stack.poll();
        // stack.poll(); Exception in thread "main" java.lang.IllegalStateException: The stack is empty
    }
}
