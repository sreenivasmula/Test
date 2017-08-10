package com.sreeni.string.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingObjects {

    public static void main(String[] args) {

        // sorting object array
        // Employee[] empArr = new Employee[4];
        // empArr[0] = new Employee(10, "Mikey", 25, 10000);
        // empArr[1] = new Employee(20, "Arun", 29, 20000);
        // empArr[2] = new Employee(5, "Lisa", 35, 5000);
        // empArr[3] = new Employee(1, "Pankaj", 32, 50000);
        //
        // //sorting employees array using Comparable interface implementation
        // Arrays.sort(empArr);

        List<Employee> empList = new ArrayList<Employee>();
        empList.add(new Employee(10, "Mikey", 25, 10000));
        empList.add(new Employee(20, "Arun", 29, 20000));
        empList.add(new Employee(5, "Lisa", 35, 5000));
        empList.add(new Employee(1, "Pankaj", 32, 50000));

        // sorting employees array using Comparable interface implementation
        Collections.sort(empList);
        System.out.println("Default Sorting of Employees list:\n" + empList.toString());

        Collections.sort(empList, SalaryComparator);

        System.out.println("Sorting of Employees on Salary list:\n" + empList.toString());

        Collections.sort(empList, NameComparator);

        System.out.println("Sorting of Employees on Salary list:\n" + empList.toString());
    }

    /**
     * Comparator to sort employees list or array in order of Salary
     */
    public static Comparator<Employee> SalaryComparator = new Comparator<Employee>() {

        @Override
        public int compare(Employee e1, Employee e2) {
            return (int) (e1.getSalary() - e2.getSalary());
        }
    };

    /**
     * Comparator to sort employees list or array in order of Age
     */
    public static Comparator<Employee> AgeComparator = new Comparator<Employee>() {

        @Override
        public int compare(Employee e1, Employee e2) {
            return e1.getAge() - e2.getAge();
        }
    };

    /**
     * Comparator to sort employees list or array in order of Name
     */
    public static Comparator<Employee> NameComparator = new Comparator<Employee>() {

        @Override
        public int compare(Employee e1, Employee e2) {
            return e1.getName().compareTo(e2.getName());
        }
    };
}
