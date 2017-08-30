package com.tek.interview.question;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

public class SortListWithMultipleFields {

    public static void main(String[] args) {

        List<Version> versionList = new ArrayList<Version>();
        Version v1 = new Version(1, "cat1", null);
        Version v2 = new Version(2, "cat1", null);
        Version v3 = new Version(3, "cat1", "cat2");
        Version v4 = new Version(4, null, null);
        Version v5 = new Version(5, "cat1", null);
        Version v6 = new Version(6, "cat1", "cat2");
        versionList.add(v1);
        versionList.add(v2);
        versionList.add(v3);
        versionList.add(v4);
        versionList.add(v5);
        versionList.add(v6);
        Collections.sort(versionList, sortListWithMultipleFields);

        for (Version verObj : versionList) {
            System.out.println(verObj.toString());
        }
        
        Map<Integer, List<String>> mapList = new ConcurrentHashMap<Integer, List<String>>();
        List<String> l1 = new ArrayList<String>();
        l1.add("cat1");
        
        List<String> l2 = new ArrayList<String>();
        l2.add("cat1");
        
        List<String> l3 = new ArrayList<String>();
        l3.add("cat1");
        l3.add("cat2");
        List<String> l4 = new ArrayList<String>();
       
        List<String> l5 = new ArrayList<String>();
        l5.add("cat1");        
        List<String> l6 = new ArrayList<String>();
        l6.add("cat1");
        l6.add("cat2");
        
        mapList.put(1, l1);
        mapList.put(2, l2);
        mapList.put(3, l3);
        mapList.put(4, l4);
        mapList.put(5, l5);
        mapList.put(6, l6);
        
        Iterator it = mapList.keySet().iterator();
        while(it.hasNext()) {
           Integer key = (Integer)it.next();
           List<String> ls = mapList.get(key);
           if(!(ls.contains("cat1") || ls.contains("cat2"))) {
               mapList.remove(key);
           }           
        }
      
        
        System.out.println(entriesSortedByValues(mapList));
        
        
        
        
        
//        Iterator ite = mapList.keySet().iterator();
//        while(ite.hasNext()) {
//           Integer key = (Integer)ite.next();
//           List<String> ls = mapList.get(key);
//           System.out.println(key + " " + ls.get(0) );  
//        }
        

    }
    
    
    
    static <K, V extends Comparable<? super V>> List<Entry<Integer, List<String>>> entriesSortedByValues(Map<Integer, List<String>> map) {

        List<Entry<Integer, List<String>>> sortedEntries = new ArrayList<Entry<Integer, List<String>>>(map.entrySet());

        Collections.sort(sortedEntries, new Comparator<Entry<Integer, List<String>>>() {
            @Override
            public int compare(Entry<Integer, List<String>> e1, Entry<Integer, List<String>> e2) {
                return e2.getKey().compareTo(e1.getKey());
            }
        });

        return sortedEntries;
    }

    public static Comparator<Version> sortListWithMultipleFields = new Comparator<Version>() {

        public int compare(Version obj1, Version obj2) {
            
            int value1 = cp(obj2.getCategory1(), obj1.getCategory1());
            if(value1==0) {
                return cp(obj2.getCategory2(), obj1.getCategory2());                
            }
            return value1;
        }
    };
    
    static <T extends Comparable<T>> int cp(T a, T b) {
        return
            a==null ?
            (b==null ? 0 : Integer.MIN_VALUE) :
            (b==null ? Integer.MAX_VALUE : a.compareTo(b));
   }
}
