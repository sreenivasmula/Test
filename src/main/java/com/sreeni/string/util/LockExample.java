package com.sreeni.string.util;

import java.util.Date;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockExample {

    public static void main(String args[]) {

        PrinterQueue printerQueue = new PrinterQueue();
        Thread thread[] = new Thread[10];
        for (int i = 0; i < 10; i++) {
            thread[i] = new Thread(new PrintingJob(printerQueue));
        }
        for (int i = 0; i < 10; i++) {
            thread[i].start();
        }
    }

}

class PrinterQueue {

    private final Lock queueLock = new ReentrantLock();

    public void printJob(Object document) {

        queueLock.lock();
        try {
            Long duration = (long) (Math.random() * 1000);
            System.out.println(Thread.currentThread().getName() + ": PrintQueue: Printing a job during "
                    + (duration / 1000) + " seconds :: Time - " + new Date());
            Thread.sleep(duration);
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            queueLock.unlock();
        }
    }
}

class PrintingJob implements Runnable {

    private PrinterQueue printerQueue;

    public PrintingJob(PrinterQueue printerQueue) {
        this.printerQueue = printerQueue;
    }

    @Override
    public void run() {
        System.out.printf("%s: Going to print a document\n", Thread.currentThread().getName());
        printerQueue.printJob(new Object());
    }

}
