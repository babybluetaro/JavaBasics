package org.example.class5;

import java.util.Scanner;

public class Task4Logical {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter Time");
        int time = input.nextInt();

        if (time>=1 && time<=11){
            System.out.println("Morning");
        } else if (time>=12 && time<=15) {
            System.out.println("Afternoon");
        } else if (time>=16 && time<=20) {
            System.out.println("Evening");
        } else if(time>=21 && time<=24){

        }
        else {
            System.out.println("Invalid");
        }

    }
}
