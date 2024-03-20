package org.example.class5;

import java.util.Scanner;

public class Task1Scanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your loan amount");
        double loan = input.nextDouble();
        if(loan<=200000){
            System.out.println("Congratulations! your application is approved");
        }else{
            System.out.println("Sorry, you are not eligible");
        }

    }
}
