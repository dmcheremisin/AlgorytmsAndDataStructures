package com.algorithms.data.structures.hashtables.challenges.removeDuplicates;

import com.algorithms.data.structures.model.Employee;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class RemoveDuplicates {

    public static void main(String[] args) {

        LinkedList<Employee> employees = new LinkedList<>();
        employees.add(new Employee("Jane", "Jones", 123));
        employees.add(new Employee("John", "Doe", 5678));
        employees.add(new Employee("Mike", "Wilson", 45));
        employees.add(new Employee("Mary", "Smith", 5555));
        employees.add(new Employee("John", "Doe", 5678));
        employees.add(new Employee("Bill", "End", 3948));
        employees.add(new Employee("Jane", "Jones", 123));

        employees.forEach(e -> System.out.println(e));

        System.out.println("   ======================   ");

        Map<Integer, Employee> map = new HashMap<>();
        employees.forEach(e -> map.put(e.getId(), e));
        map.forEach((k,v) -> System.out.println(k + ":" + v));

        System.out.println("   ======================   ");

        List<Employee> unique = new LinkedList<>(map.values());
        unique.forEach(e -> System.out.println(e));

    }

}
