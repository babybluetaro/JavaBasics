package org.example.class5;

import java.util.Scanner;

public class Task6Logical {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter Quiz Score");
        double quiz = input.nextDouble();
        System.out.println("Enter Mid term Score");
        double mid = input.nextDouble();
        System.out.println("Enter Final Score");
        double fin= input.nextDouble();
        double ave = (quiz+mid+fin)/3;

        if (ave>=90 && ave<=100){
            System.out.println("A");
        } else if (ave>=70 && ave<90) {
            System.out.println("B");
        } else if (ave>=50 && ave<70) {
            System.out.println("C");
        } else if(ave<50){
            System.out.println("F");
        }
        else {
            System.out.println("Invalid");
        }

    }
}
