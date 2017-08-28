package com.sreeni.string.util;

public class ThreadDeadLockSolution {

    private static Object lock1 = new Object();

    private static Object lock2 = new Object();

    public static void main(String[] args) {

        Thread t1 = new Thread1();
        Thread t2 = new Thread2();
        t1.start();
        t2.start();

    }

    private static class Thread1 extends Thread {

        public void run() {

            synchronized (lock1) {
                System.out.println("Thread 1: Holding lock 1...");
                try {
                    Thread.sleep(10);

                } catch (Exception ex) {
                    ex.printStackTrace();
                }

                System.out.println("Thread 1: Waiting for lock 2...");
                synchronized (lock2) {
                    try {
                        Thread.sleep(1);
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }

            }
        }
    }

    private static class Thread2 extends Thread {

        public void run() {

            synchronized (lock2) {
                System.out.println("Thread 2: Holding lock 2...");
                try {
                    Thread.sleep(10);
                } catch (Exception ex) {
                    ex.printStackTrace();
                }

                System.out.println("Thread 2: Waiting for lock 1...");
                synchronized (lock1) {
                    try {
                        Thread.sleep(1);
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }

                }
            }
        }
    }

}
