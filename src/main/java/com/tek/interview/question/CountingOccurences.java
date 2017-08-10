package com.tek.interview.question;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

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
    }
}
