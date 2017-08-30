package com.tek.interview.question;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SearchVersionByCriteria {

    public static void main(String[] args) {

        List<Version> versionList = new ArrayList<Version>();
        versionList.add(new Version(1, "cat1", null));
        versionList.add(new Version(2, "cat1", "cat2"));
        versionList.add(new Version(3, null, "cat2"));
        versionList.add(new Version(4, null, null));
        versionList.add(new Version(5, "cat1", null));
        versionList.add(new Version(6, "cat1", "cat2"));
        
        Criteria cat1 = new CriteriaImpl("cat1");
        Criteria cat2 = new CriteriaImpl("cat2");
        Criteria cat1AndCat2 = new AndCriteria(cat1, cat2);
        //Criteria cat1OrCat2 = new OrCriteria(cat1, cat2);
        
        System.out.println("Cat1: ");
        printPersons(cat1.meetCriteria(versionList));

        System.out.println("\nCat2: ");
        printPersons(cat2.meetCriteria(versionList));
        
        System.out.println("\nCat1 And Cat2: ");
        versionList = cat1AndCat2.meetCriteria(versionList);
        Collections.sort(versionList, sortListDescendingOrder);
        printPersons(versionList);
        
//        System.out.println("\nCat1 or Cat2: ");
//        versionList = cat1OrCat2.meetCriteria(versionList);
//        Collections.sort(versionList, sortListDescendingOrder);
//        printPersons(versionList);
        
        
    }
    
    public static Comparator<Version> sortListDescendingOrder = new Comparator<Version>() {

        public int compare(Version obj1, Version obj2) {            
            return obj2.getId()-obj1.getId();            
        }
    };
    
    
    
    public static void printPersons(List<Version> versions){
        
        for (Version version : versions) {            
            System.out.println(version.toString());           
        }
     }   

}
