package com.sreeni.string.util;

public class ClassA extends Thread {
    
    public int count;
    public void run() {
       while(count < 2017) {           
            count++;
            System.out.println(count);
        } 
    }
    
    public static void main(String []args) {
        
        ClassA a = new ClassA();
        a.start();
        System.out.println("Count : " + a.count);        
    }

}