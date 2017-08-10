package com.sreeni.string.util;

import java.util.HashMap;
import java.util.Map;

public class StringTest {

    public static void main(String[] args) {
        
        String s1 = "abc";
        String s2 = "abc";
        
        System.out.println("s1==s2 : " + s1==s2 );
        System.out.println("s1.equals(s2) : " + s1.equals(s2) );
        
        String s3 = new String("abc");
        
        System.out.println("s1==s3 : " + s1==s3 );
        
        System.out.println("s1.equals(s3) : " + s1.equals(s3) );
        
        StringBuilder sb1 = new StringBuilder();
        sb1.append("abc");
        final StringBuilder sb2 = new StringBuilder();
        sb2.append("abc");
        
        System.out.println("sb2 : " + sb2);
        
        StringBuffer sbOriginal = new StringBuffer("SB1");
        foo(sbOriginal);
        System.out.println("sbOriginal : " + sbOriginal);      
        
        
        Map<MyKey, String> hm = new HashMap<MyKey, String>();
        hm.put(new MyKey(),  "1");
        hm.put(new MyKey(),  "2");
        hm.put(new MyKey(),  "3");
        hm.put(new MyKey(),  "4");
        
        System.out.println("Entries in Map : " + hm.get(new MyKey()));
        System.out.println("Entries in Map size: " + hm.size());

    }
    
    public static void foo(StringBuffer sb) {
        sb.append("foo");
        sb = new StringBuffer();        
        sb.append("wow");
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
