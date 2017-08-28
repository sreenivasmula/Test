package com.sreeni.string.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CustomerSortedList {
    
    public static void main(String args[]) {
        
        List<Customer> customers = new ArrayList<Customer>();
        
        customers.add(new Customer("Sreeni","Mula",44,125000));
        customers.add(new Customer("Jyothi","FMula",38,125000));
        customers.add(new Customer("Usha","GMula",11,125000));
        customers.add(new Customer("Charan","BMula",7,125000));
        Collections.sort(customers);
        for(Customer customer : customers) {
            System.out.println(customer.toString());
        }
        
        Collections.sort(customers, lastNameComparator);
        
        for(Customer customer : customers) {
            System.out.println(customer.toString());
        }
        
        Collections.sort(customers, ageComparator);
        
        for(Customer customer : customers) {
            System.out.println(customer.toString());
        }
        
    }
    
    public static Comparator<Customer> lastNameComparator = new Comparator<Customer>() {               
       
        public int compare(Customer cust1, Customer cust2) {
            return cust1.getLastName().compareTo(cust2.getLastName());
        }        
    };
    
    public static Comparator<Customer> ageComparator = new Comparator<Customer>() {
      
        public int compare(Customer cust1, Customer cust2) {
            return cust1.getAge() - cust2.getAge();
        }
    };
    
    

}