package org.example.review3;

import java.util.Scanner;

public class E6LogicalOp {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your age");
        int age = input.nextInt();

        if (age!=10&&age!=20&&age!=30){
            System.out.println("you will get the discount");
        }else{
            System.out.println("No discount");
        }
    }
}
