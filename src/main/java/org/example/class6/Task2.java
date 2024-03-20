package org.example.class6;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter your grade");
        char grade = input.next().toUpperCase().charAt(0);
        // next()=pick the first word of the input
        //toUppercase =chage input to uppercase
        //cahrAt(0)=pick only first letter

        switch(grade){
            case 'A':
                System.out.println("Grade "+grade+" Excellent");
                break;
            case 'B':
                System.out.println("Grade "+grade+" Good");
                break;
            case 'C':
                System.out.println("Grade "+grade+" Average");
                break;
            case 'D':
                System.out.println("Grade "+grade+" Bad");
                break;
            default:
                System.out.println("Grade "+grade+" Not acceptable");


        }
    }
}
