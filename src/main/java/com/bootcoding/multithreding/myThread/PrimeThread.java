package com.bootcoding.multithreding.myThread;

public class PrimeThread extends Thread{
    public void run(){
        for(int number = 100;number<2000;number++){
            if (number <= 1) {
                System.out.println("not a prime number");
            }
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    System.out.println("not a prime number");
                }
            }
            System.out.println("It is a prime number");
        }
        }

}


