package org.example.class6;

import java.util.Scanner;

public class E9Loops {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter The Starting point of the loops");
        int start = input.nextInt();
        System.out.println("Please Enter The Stopping number");
        int end = input.nextInt();
        System.out.println("Please enter the step size");
        int step=input.nextInt();

        while(start<=end){
            System.out.print(start+" ");
            start+=step;
        }
    }
}
