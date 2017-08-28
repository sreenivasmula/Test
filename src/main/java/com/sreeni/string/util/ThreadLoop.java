package com.sreeni.string.util;

class ThreadWhile extends Thread {
    
    private int count;
    public int getCount() {
        return count;
    }

    

    private String threadName;
    
    ThreadWhile(String name) {
        threadName = name;
        System.out.println("Creating " +  threadName );
     }
    
    public void run() {
       
            while(count < 1207) {          
                    count++;                  
            }            
        
    }
    
}

public class ThreadLoop {

    public static void main(String[] args) {
        
        try {
        
        ThreadWhile t = new ThreadWhile("ThreadWhileTest");
        t.start();
        t.join();
        //t.sleep(1);
        System.out.println("Count: " + t.getCount());      
        }catch(InterruptedException ie) {
            
        }

    }
    
    

}



