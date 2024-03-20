package org.example.class6;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Please Enter 2 numbers and 1operator");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        char op=input.next().charAt(0);

        switch(op){
            case'+':
                System.out.println(num1+num2);
                break;
            case'-':
                System.out.println(num1-num2);
                break;
            case'*':
                System.out.println(num1*num2);
                break;
            case'/':
                System.out.println(num1/num2);
                break;
            default:
                System.out.println("Invalid");
        }
    }
}
