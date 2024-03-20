package org.example.review3;

import java.util.Scanner;

public class E2Scanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter Your Grade");
        char grade = input.next().toUpperCase().charAt(0);
        switch(grade){
            case'A':
                System.out.println("Very Good Grade");
                break;
            case'B':
                System.out.println("Good Grade");
                break;
            case'C':
                System.out.println("AVG Grade");
                break;
            case'D':
                System.out.println("BAD Grade");
                break;
            case'F':
                System.out.println("Failed");
                break;
            default:
                System.out.println("Invalid");
        }
    }
}
