package comparation;

import java.util.*;

public class Test2 {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        Employee employee1 = new Employee(7, "Musa", "Muradov", 50000);
        Employee employee2 = new Employee(15, "Yakov", "Viktorov", 30000);
        Employee employee3 = new Employee(1, "Alex", "Ivanov", 100000);
        list.add(employee1);
        list.add(employee2);
        list.add(employee3);
        System.out.println("Before sorting\n" + list);
        Collections.sort(list);
        System.out.println("After sorting\n" + list);
    }
}

class Employee  implements Comparable<Employee> {

    int id;
    String name;
    String sureName;
    int salary;

    public Employee(int id, String name, String sureName, int salary) {
        this.id = id;
        this.name = name;
        this.sureName = sureName;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sureName='" + sureName + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee anotherEmployee) {
        if (this.id == anotherEmployee.id)
            return 0;
        else if (this.id < anotherEmployee.id)
            return -1;
        else return 1;
    }
////        return this.id - anotherEmployee.id;
////        return this.id.compareTo(anotherEmployee.id);
//        int result = this.name.compareTo(anotherEmployee.name);
//        if (result == 0) {
//            result = this.sureName.compareTo(anotherEmployee.sureName);
//        }
//        return result;
//    }
}

//class IdComporator implements Comparator<Employee> {
//
//    @Override
//    public int compare(Employee employee1, Employee employee2) {
//        if (employee1.id == employee2.id)
//            return 0;
//        else if (employee1.id < employee2.id)
//            return -1;
//        else return 1;
//    }
//}

class NameComporator implements Comparator<Employee> {

    @Override
    public int compare(Employee employee1, Employee employee2) {
        return employee1.name.compareTo(employee2.name);
    }
}

class SalaryComporator implements Comparator<Employee> {

    @Override
    public int compare(Employee employee1, Employee employee2) {
        return employee1.salary-employee2.salary;
    }
}