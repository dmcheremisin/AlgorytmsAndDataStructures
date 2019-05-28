package com.algorithms.data.structures.lists.challenges.addBeforeExisting;

import com.algorithms.data.structures.lists.Employee;

public class EmployeeNode {

    private Employee employee;
    private EmployeeNode next;
    private EmployeeNode previous;

    public EmployeeNode(Employee employee) {
        this.employee = employee;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public EmployeeNode getNext() {
        return next;
    }

    public void setNext(EmployeeNode next) {
        this.next = next;
    }

    public EmployeeNode getPrevious() {
        return previous;
    }

    public void setPrevious(EmployeeNode previous) {
        this.previous = previous;
    }

    @Override
    public String toString() {
        return employee.toString();
    }

    @Override
    public int hashCode() {
        return employee.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof EmployeeNode) {
            Employee employee = ((EmployeeNode) obj).getEmployee();
            return this.employee == null ? employee == null : this.employee.equals(employee);
        }
        return false;
    }
}
