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


/*
 * Copyright 2017 Capital One Financial Corporation All Rights Reserved.
 * 
 * This software contains valuable trade secrets and proprietary information of
 * Capital One and is protected by law. It may not be copied or distributed in
 * any form or medium, disclosed to third parties, reverse engineered or used in
 * any manner without prior written authorization from Capital One.
 */
