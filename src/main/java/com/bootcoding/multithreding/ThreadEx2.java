package com.bootcoding.multithreding;

import com.bootcoding.multithreding.myThread.FibonnaciThread;
import com.bootcoding.multithreding.myThread.PalindromeThread;
import com.bootcoding.multithreding.myThread.PrimeThread;

public class ThreadEx2 {
    public static void main(String[] args) {
//        System.out.println(Thread.currentThread().getName());
//        System.out.println(Thread.currentThread().getPriority());

        Thread t1= new FibonnaciThread();
        t1.start();

        Thread t2 = new PalindromeThread();
        t2.start();

        Thread t3= new PrimeThread();
        t3.start();
    }
}
