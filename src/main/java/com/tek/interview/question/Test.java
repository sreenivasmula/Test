package com.tek.interview.question;

public class Test {

    public static void main(String[] args) {
        
        String str = "vikat akiv";
        
        str = str.replace(" ", "");
        
        System.out.println(str + " is Palindrome? " + isPalindromeString(str));
    }
    
    private static boolean isPalindromeString(String str) {
        if (str == null)
            return false;
        int length = str.length();
        System.out.println(length / 2);
        for (int i = 0; i < length / 2; i++) {
            if (str.charAt(i) != str.charAt(length - i - 1))
                return false;
        }
        return true;
    }

}