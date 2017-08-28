package com.sreeni.string.util;

public class Customer implements Comparable<Customer> {
    
    private String firstName;
    private String lastName;
    private int age;
    private double salary;
    
    public Customer(String firstName, String lastName, int age, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }
    
    public String getFirstName() {
        return firstName;
    }
  
    public String getLastName() {
        return lastName;
    }
   
    public int getAge() {
        return age;
    }
  
    public double getSalary() {
        return salary;
    }
   
    @Override
    public int compareTo(Customer cust) {
        return this.firstName.compareTo(cust.firstName);
    }   
    
    public String toString() {
        return this.firstName + ", " + this.lastName + ", " + this.age + ", " + this.salary;
    }
}


