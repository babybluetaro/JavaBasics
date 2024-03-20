package org.example.class5;

import java.util.Scanner;

public class Task2Scanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your age");
        int age = input.nextInt();

        if(age>=18){
            System.out.println("You got the license");
        }else{
            System.out.println("Get the learner permit first");
        }

    }
}
