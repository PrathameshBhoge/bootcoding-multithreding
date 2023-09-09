package com.bootcoding.multithreding.myThread;

public class PalindromeThread extends Thread {
   public void run(){
      for(int i= 100;i<20000;i++){
          int originalNumber = i;
          int reversedNumber = 0;

          while (originalNumber > 0) {
              int remainder = originalNumber % 10;
              reversedNumber = reversedNumber * 10 + remainder;
              originalNumber= originalNumber / 10;
          }
          if(reversedNumber== i){
              System.out.println(i+ "It is a palindrome number");
          }else{
              System.out.println(i+"Not a palindrome number");
          }

      }

   }
}







