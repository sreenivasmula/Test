package com.sreeni.string.util;

public class DataStructures {

    public static void main(String[] args) {

        int [] x = { -5, 12, 15, 20, 30, 72, 456 };
        int loIndex = 0;
        int hiIndex = x.length - 1;
        int midIndex, srch = 72;
        while (loIndex <= hiIndex)
        {
           midIndex = (loIndex + hiIndex) / 2;
           if (srch > x [midIndex])
               loIndex = midIndex + 1;
           else
           if (srch < x [midIndex])
               hiIndex = midIndex - 1;
           else
               break;
        }
        if (loIndex > hiIndex)
            System.out.println (srch + " not found");
        else
            System.out.println (srch + " found");
        
        
        int i, pass;
        int [] b = { 20, 15, 12, 30, -5, 72, 456 };
        for (pass = 0; pass <= b.length-2; pass++)
             for (i = 0; i <= b.length - pass - 2; i++)
                  if (b [i] >  b [i + 1])
                  {
                      int temp = b [i];
                      b [i] = b [i + 1];
                      b [i + 1] = temp;
                  }
        for (i = 0; i <  x.length; i++)
             System.out.println (x [i]);

    }

}


