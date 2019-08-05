package com.algorithms.data.structures.lists.singleLinkedList;

import com.algorithms.data.structures.model.Employee;

public class SingleLinkedList {

    private EmployeeNode head;
    private int size;

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addToFront(Employee employee) {
        EmployeeNode node = new EmployeeNode(employee);
        node.setNext(head);
        head = node;
        size++;
    }

    public Employee removeFromFront() {
        if(isEmpty()) {
            return null;
        }
        Employee employee = head.getEmployee();
        head = head.getNext();
        size--;
        return employee;
    }

    public void add(Employee employee) {
        EmployeeNode node = new EmployeeNode(employee);
        EmployeeNode next = head;
        while(next.getNext() != null) {
            next = next.getNext();
        }
        next.setNext(node);
        size++;
    }

    public Employee remove() {
        if(isEmpty()) {
            return null;
        }
        EmployeeNode next = head;
        EmployeeNode previous = null;
        while(next.getNext() != null) {
            previous = next;
            next = next.getNext();
        }
        Employee employee = next.getEmployee();
        if(previous != null) {
            previous.setNext(null);
            size--;
        } else {
            head = null;
            size = 0;
        }
        return employee;
    }

    public void printList() {
        EmployeeNode next = head;
        System.out.print("HEAD -> ");
        while(next != null) {
            System.out.println(next);
            System.out.print("NEXT -> ");
            next = next.getNext();
        }
        System.out.println("null");

    }
}
