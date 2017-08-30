package com.tek.interview.question;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountingOccurences {

    public static void main(String[] args) {

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
            System.out.println(key + " = " + map.get(key));
        }
        
        Map<Character, Integer> continueOccurancemap = new HashMap<Character, Integer>();
        for (int i = 0; i < str.length(); i++) {
            if(i < str.length()-1) {
                char c = str.charAt(i);
                char c1 = str.charAt(i+1);
                if(c==c1) {
                    if (continueOccurancemap.containsKey(c)) {
                        int cnt = continueOccurancemap.get(c);
                        continueOccurancemap.put(c, ++cnt);
                    } else {
                        continueOccurancemap.put(c, 2);
                    }
                }
            }
        }
        Iterator iterator1 = continueOccurancemap.keySet().iterator();
        while (iterator1.hasNext()) {
            char key = (char) iterator1.next();
            System.out.println(key + " = " + continueOccurancemap.get(key));
        }       
        
        String input = "Geek For Geeks";
        String strArr[] = input.split(" ");
        List list = Arrays.asList(strArr);   
 
        
 
        Collections.reverse(list);
        ListIterator li = list.listIterator();
        while (li.hasNext())
            System.out.println(li.next());
        
        String line = "This line contains JAVA, lets see";
        
        Pattern ptn = Pattern.compile("java");
        Matcher mtch = ptn.matcher(line);
        if(mtch.find()) {
            System.out.println(true);            
        }
        else {
            System.out.println(false);   
        }
        
        String EXAMPLE_TEST = "Hi , This is test .";
        
        String pattern = "(\\w)(\\s+)([\\.,])";
        System.out.println(EXAMPLE_TEST.replaceAll(pattern, "$1$3"));
        
        EXAMPLE_TEST = "Hi , <title>This is test<title> .";
        
        pattern = "(?i)(<title.*?>)(.+?)()";        
        System.out.println(EXAMPLE_TEST.replaceAll(pattern, "$2"));
    }
        
    
}
