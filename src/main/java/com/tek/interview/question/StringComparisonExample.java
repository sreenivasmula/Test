package com.tek.interview.question;

/**
 * This program is used to show the use of == operator.
 * @author javawithease.
 */
class TestString{
    
 
    /**
     * This method is used to compare strings using == operator.
     * @author javawithease
     */
    public void stringComparison(){
        
        String str1 = "javawithease";
        String str2 = "javawithease";
        String str3 = new String("javawithease");
        //return true, because str1 and str2 both refers to the 
        //same instance created in String constant pool.
        System.out.println(str1 == str2);
 
        //return false, because str3 refers to the 
        // instance created in nonpool.
        System.out.println(str1 == str3);
    }
}
 
public class StringComparisonExample {
    public static void main(String args[]){
        
        String str1 = "abc";
        String str2 = "abc";
        String str3 = new String("abc");
        //return true, because str1 and str2 both refers to the 
        //same instance created in String constant pool.
        System.out.println(str1 == str2);
 
        //return false, because str3 refers to the 
        // instance created in nonpool.
        System.out.println(str1 == str3);
        
        //creating TestString object. 
        //TestString obj = new TestString();
 
        //method call
        //obj.stringComparison();
    }
}