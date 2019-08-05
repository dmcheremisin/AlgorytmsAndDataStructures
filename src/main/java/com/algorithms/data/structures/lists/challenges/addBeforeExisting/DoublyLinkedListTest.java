package com.algorithms.data.structures.lists.challenges.addBeforeExisting;

import com.algorithms.data.structures.model.Employee;

public class DoublyLinkedListTest {

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        System.out.println(list.isEmpty()); // true

        Employee johnSnow = new Employee(25, "John", "Snow");
        Employee dainerisTargarien = new Employee(38, "Daineris", "Targarien");
        Employee tyronLannister = new Employee(41, "Tyron", "Lannister");

        list.add(johnSnow);
        list.add(dainerisTargarien);
        list.add(tyronLannister);

        list.printList();
//        HEAD -> Employee{id=25, firstName='John', lastName='Snow'}
//        NEXT <=> Employee{id=38, firstName='Daineris', lastName='Targarien'}
//        NEXT <=> Employee{id=41, firstName='Tyron', lastName='Lannister'}
//        NEXT <=> null

        Employee cerseiLannister = new Employee(43, "Cersei", "Lannister");
        Employee sansaStark = new Employee(43, "Sansa", "Stark");

        list.addBefore(cerseiLannister, johnSnow);
        list.addBefore(sansaStark, tyronLannister);

        list.printList();
//        HEAD -> Employee{id=43, firstName='Cersei', lastName='Lannister'}
//        NEXT <=> Employee{id=25, firstName='John', lastName='Snow'}
//        NEXT <=> Employee{id=38, firstName='Daineris', lastName='Targarien'}
//        NEXT <=> Employee{id=43, firstName='Sansa', lastName='Stark'}
//        NEXT <=> Employee{id=41, firstName='Tyron', lastName='Lannister'}
//        NEXT <=> null

        boolean result = list.addBefore(sansaStark, new Employee(23, "Miss", "Andeya"));
        System.out.println(result); // false
    }
}
