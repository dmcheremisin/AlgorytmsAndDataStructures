package com.algorithms.data.structures.stacks.linkedListStack;

import com.algorithms.data.structures.model.Employee;

/**
 * Created by Dmitrii on 01.06.2019.
 */
public class LinkedListStackTest {
    public static void main(String[] args) {
        Employee johnSnow = new Employee(25, "John", "Snow");
        Employee dainerisTargarien = new Employee(38, "Daineris", "Targarien");
        Employee tyronLannister = new Employee(41, "Tyron", "Lannister");
        Employee cerseiLannister = new Employee(43, "Cersei", "Lannister");
        Employee sansaStark = new Employee(43, "Sansa", "Stark");

        LinkedListStack stack = new LinkedListStack();
        stack.push(johnSnow);
        stack.push(dainerisTargarien);
        stack.push(tyronLannister);
        stack.push(cerseiLannister);
        System.out.println(stack.peek());// Employee{id=43, firstName='Cersei', lastName='Lannister'}

        System.out.println(stack.pop());// Employee{id=43, firstName='Cersei', lastName='Lannister'}
        System.out.println(stack.peek());// Employee{id=41, firstName='Tyron', lastName='Lannister'}

        stack.push(sansaStark);
        System.out.println(stack.peek());// Employee{id=43, firstName='Sansa', lastName='Stark'}

    }
}
