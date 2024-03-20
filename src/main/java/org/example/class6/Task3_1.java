package org.example.class6;

import java.util.Scanner;

public class Task3_1 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Please Enter number 1");
        double num1 = input.nextDouble();
        System.out.println("Please enter number 2");
        double num2 = input.nextDouble();
        System.out.println("Please enter operator");
        char op = input.next().charAt(0);

        if(op=='+') {
            System.out.println(num1 + num2);
        } else if(op=='-'){
            System.out.println(num1-num2);
        }else if (op=='*'){
            System.out.println(num1*num2);
        }else if (op=='/'){
            System.out.println(num1/num2);
        }else{
            System.out.println("Invalid");
        }



    }
}
