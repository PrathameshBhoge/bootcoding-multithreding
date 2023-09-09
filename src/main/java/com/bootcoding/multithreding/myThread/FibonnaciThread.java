package com.bootcoding.multithreding.myThread;

public class FibonnaciThread extends Thread {

    public void run() {
        for(int number = 100; number < 2000;number++){
            if (isPerfectSquare(5 * number * number + 4) || isPerfectSquare(5 * number * number - 4)) {
                System.out.println(number + " is a Fibonacci number.");
            } else {
                System.out.println(number + " is not a Fibonacci number.");
            }
        }
    }
    public static boolean isPerfectSquare(int x) {
        int sqrt = (int) Math.sqrt(x);
        return sqrt * sqrt == x;
    }
}
