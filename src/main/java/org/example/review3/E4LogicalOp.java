package org.example.review3;

import java.util.Scanner;

public class E4LogicalOp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your age");
        int age = input.nextInt();

        if(age<10||age>50){
            System.out.println("20% discount");
        }else{
            System.out.println("No discount");
        }
    }
}
