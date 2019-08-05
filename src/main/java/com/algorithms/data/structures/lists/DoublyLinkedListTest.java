package com.algorithms.data.structures.lists;

import com.algorithms.data.structures.lists.doublyLinkedList.DoublyLinkedList;
import com.algorithms.data.structures.model.Employee;

public class DoublyLinkedListTest {

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        System.out.println(list.isEmpty()); // true

        list.addToFront(new Employee(25, "John", "Snow"));
        list.addToFront(new Employee(38, "Daineris", "Targarien"));
        list.addToFront(new Employee(41, "Tyron", "Lannister"));
        list.add(new Employee(43, "Cersei", "Lannister"));

        System.out.println(list.getSize()); // 4
        System.out.println(list.isEmpty()); // false

        list.printList();
//        HEAD -> Employee{id=41, firstName='Tyron', lastName='Lannister'}
//        NEXT <=> Employee{id=38, firstName='Daineris', lastName='Targarien'}
//        NEXT <=> Employee{id=25, firstName='John', lastName='Snow'}
//        NEXT <=> Employee{id=43, firstName='Cersei', lastName='Lannister'}
//        NEXT <=> null

        list.removeFromFront();
        System.out.println(list.getSize()); // 3

        list.printList();
//        HEAD -> Employee{id=38, firstName='Daineris', lastName='Targarien'}
//        NEXT <=> Employee{id=25, firstName='John', lastName='Snow'}
//        NEXT <=> Employee{id=43, firstName='Cersei', lastName='Lannister'}
//        NEXT <=> null

        list.remove();
        list.printList();
//        HEAD -> Employee{id=38, firstName='Daineris', lastName='Targarien'}
//        NEXT <=> Employee{id=25, firstName='John', lastName='Snow'}
//        NEXT <=> null

        list.remove();
        Employee removed = list.remove();
        Employee nullEmployee = list.remove();
        list.printList();
//        HEAD -> null

        System.out.println("Removed: " + removed);
        System.out.println("No elements, so null: " + nullEmployee);
//        Removed: Employee{id=38, firstName='Daineris', lastName='Targarien'}
//        No elements, so null: null
    }
}
