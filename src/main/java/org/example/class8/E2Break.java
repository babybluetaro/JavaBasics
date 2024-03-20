package org.example.class8;

import java.util.Scanner;

public class E2Break {
    public static void main(String[] args) {

       int[] numbers={10,60,30,40,50,60};

       for (int num:numbers){

           if (num>50){
           continue;  //if num>50 skip operation below = continue to the next number element
           }
           System.out.println(num+10);
           System.out.println(num*10);
           System.out.println(num/10);
           System.out.println(num%10);
           System.out.println("*****");
       }
    }
}
