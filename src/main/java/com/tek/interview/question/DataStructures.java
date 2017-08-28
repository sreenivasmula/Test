package com.tek.interview.question;

import java.util.Arrays;

public class DataStructures {
    
    public static void main(String arg[]) {
        
        int a[] = {1,2,3};
        int b[] = {5,6,7,8};
        
        int [] newArray = new int[a.length+b.length];
        System.arraycopy( a, 0, newArray, 0, a.length);
        System.arraycopy( b, 0, newArray, a.length, b.length );
        
        System.out.println(Arrays.toString(newArray));       
             
        
        String str = "Sreenivasula";
        
        System.out.println(reverse(str));
        
        for(int i=0;i<5;i++) {
            System.out.println(fib(i));
        }
        
    }
    
    public static String reverse ( String s ) {
        int length = s.length(), last = length - 1;
        char[] chars = s.toCharArray();
        for ( int i = 0; i < length/2; i++ ) {
            char c = chars[i];
            chars[i] = chars[last - i];
            chars[last - i] = c;
        }
        return new String(chars);
    }
    
    static long fib(int n) {
        System.out.println("N repeat :" + n);
        return n <= 1 ? n : fib(n-1) + fib(n-2);
    }

}


