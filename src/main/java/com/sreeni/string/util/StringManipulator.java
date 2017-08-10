package com.sreeni.string.util;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class StringManipulator {

    public static void main(String[] args) {
        
        String palindrome = "abcdcbaa";
        char[] strArray = palindrome.toCharArray();
        
        boolean isPalindrome=true;
        for(int i=0;i<palindrome.length()/2;i++) {
            if(strArray[i]!=strArray[palindrome.length()-i-1]) {
                isPalindrome=false;
            } 
        }
        
        System.out.println("abcdcba is Palindrome? " + isPalindrome);     
        
        String str = "abcddeeefaa";
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (map.containsKey(c)) {
                int cnt = map.get(c);
                map.put(c, ++cnt);
            } else {
                map.put(c, 1);
            }
        }
        Iterator iterator = map.keySet().iterator();        
        while (iterator.hasNext()) {
            char key = (char) iterator.next();            
            System.out.print(key + " = " + map.get(key) + " " );
        }
        
        String s[] = "He is the one".split(" ");
        String finalStr="";
            for(int i = s.length-1; i>= 0 ;i--){
                finalStr += s[i]+" ";
            }
            System.out.println(finalStr);
            
            System.out.println(reverseWords1("This is reverse string"));
            
            String[] reversStr = "This is my reverse string".split(" ");
            String reverseWords = "";
            for(int i=0;i<reversStr.length-1;i++) {
                String nonReverseWord = reversStr[i];
                reverseWords += reverseWord(nonReverseWord) + " ";
            }
            System.out.println("This is my reverse words in String " + reverseWords);
            
            
            int n;
            String temp;
            Scanner s2 = new Scanner(System.in);
            System.out.print("Enter number of names you want to enter:");
            n = s2.nextInt();
            String names[] = new String[n];
            Scanner s1 = new Scanner(System.in);
            System.out.println("Enter all the names:");
            for(int i = 0; i < n; i++)
            {
                names[i] = s1.nextLine();
            }
            for (int i = 0; i < n; i++) 
            {
                for (int j = i + 1; j < n; j++) 
                {
                    if (names[i].compareTo(names[j])<0) 
                    {
                        temp = names[i];
                        names[i] = names[j];
                        names[j] = temp;
                    }
                }
            }
            System.out.print("Names in Sorted Order:");
            for (int i = 0; i < n - 1; i++) 
            {
                System.out.print(names[i] + ",");
            }
            System.out.print(names[n - 1]);
    }
    
    private static String reverseWord(String word) {
        char[] w = word.toCharArray();
        for (int i = 0, j = word.length() - 1; i < j; i++, j--) {
            char swap = w[i];
            w[i] = w[j];
            w[j] = swap;
        }
        return new String(w);
    }
    
    private static void reverse(char[] buf, int start, int end) {
        for (int i = start, j = end - 1; i < j; i++, j--) {
            char swap = buf[i];
            buf[i] = buf[j];
            buf[j] = swap;
        }
    }

    public static String reverseWords1(String sentence) {
        char[] buf = sentence.toCharArray();

        // Reverse the string, character-wise
        reverse(buf, 0, buf.length);

        // Within each word, reverse the characters again
        int wordEnd = 0;
        for (int wordStart = 0; wordStart < buf.length; wordStart = wordEnd + 1) {
            for (wordEnd = wordStart; wordEnd < buf.length && buf[wordEnd] != ' '; wordEnd++) {}

            // wordStart is at the start of a word.
            // wordEnd is just past the end of the word.
            reverse(buf, wordStart, wordEnd);
        }
        return new String(buf);
    }
    

}