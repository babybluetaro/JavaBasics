package org.example.review3;

import java.util.Scanner;

public class E3Scanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your name");
        String name = input.nextLine();
        System.out.println("Please enter your favorite color");
        String color = input.nextLine();

        if (color.equalsIgnoreCase("blue")){
            if(name.equalsIgnoreCase("Ana")){
                System.out.println("I am a very good driver");
            }else{
                System.out.println("I'am Will");
            }
        }else{
            System.out.println("You are very boring");
        }
    }
}
