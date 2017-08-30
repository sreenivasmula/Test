package com.sreeni.string.util;

import java.util.HashMap;
import java.util.Map;

public class StringTest {

    public static void main(String[] args) {
        
        String s1 = "abc";
        String s2 = "ABC";
        String s3 = new String("abc");
        String s4 = s2;
       
        final String s5;
        s5=s1;
        
        System.out.print("s1==s2 : ");        
        System.out.println(s1==s2);
        System.out.println("s1.equals(s2) : " + s1.equals(s2) );
        System.out.print("s1==s3 : ");        
        System.out.println(s1==s3 );        
        System.out.println("s1.equals(s3) : " + s1.equals(s3) );
        System.out.print("s4==s2 : ");
        System.out.println(s4==s2);
        System.out.println("s4.equals(s2) : " + s4.equals(s2) );
        System.out.print("s5==s1 : ");  
        System.out.println(s5==s1);      
        
        
                     
        StringBuilder sb1 = new StringBuilder();
        sb1.append("abc");
        
        System.out.println("sb1 : " + sb1);
        
        final StringBuilder sb2 = new StringBuilder();
        sb2.append("abc");
        
        System.out.println("sb2 : " + sb2);
        
        StringBuffer sbOriginal = new StringBuffer("SB1");
        sbOriginal.reverse();
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