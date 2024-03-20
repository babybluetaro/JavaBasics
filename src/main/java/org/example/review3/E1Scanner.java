package org.example.review3;

import java.util.Scanner;

public class E1Scanner {
    public static void main(String[] args) {

       Scanner input = new Scanner(System.in);
        System.out.println("Please Enter your age");
        int age = input.nextInt();

        if(age>50){
            System.out.println("You will get 20% discount");
        }else{
            System.out.println("You will get 10% discount");
        }
    }
}
