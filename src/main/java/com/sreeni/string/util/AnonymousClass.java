package com.sreeni.string.util;

/**
 * This program is used to show the use of AnonymousBlock.
 * 
 * @author javawithease
 */
class Display {
    int a, b;

    // Anonymous or instance initializer Block
    {
        System.out.println("AnonumousBlock called.");
        a = 10;
    }

    // default constructor
    Display() {
        System.out.println("default constructor called.");
    }

    // one argument constructor
    Display(int num) {
        System.out.println("one parameter constructor called.");
        b = num;
    }

    // method to display values
    public void display() {
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}

public class AnonymousClass {
    public static void main(String args[]) {
        Display obj1 = new Display();
        obj1.display();

        Display obj2 = new Display(20);
        obj2.display();
    }
}
