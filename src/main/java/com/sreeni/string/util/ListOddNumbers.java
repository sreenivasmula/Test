package com.sreeni.string.util;

public class ListOddNumbers {
    
    public static void main(String[] args) {
           
            //define the limit
            int a = 50;
            int b = 100;
           
            System.out.println("Printing Odd numbers between " + a + " and " + b);
           
            for(int i=a; i <= b; i++){
                   
                    //if the number is not divisible by 2 then it is odd
                    if( i % 2 == 1){
                            System.out.print(i + " ");
                    }
            }
    }
}

