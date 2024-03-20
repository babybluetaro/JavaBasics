package org.example.class5;

import java.util.Scanner;

public class Task5Scanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number of worked years");
        int year = input.nextInt();

        if (year>=5){
            System.out.println("Please enter your annual salary");
            int salary = input.nextInt();
            if (salary>50000){
                System.out.println("Your bonus is 5000");
            }else{
                System.out.println("Your bonus is 3000");
            }

        }else{
            System.out.println("You are not eligible for the bonus");
        }
    }
}
