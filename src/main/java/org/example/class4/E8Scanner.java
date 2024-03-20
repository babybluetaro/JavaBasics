package org.example.class4;

import java.util.Scanner;

public class E8Scanner {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("Please enter your name");
        String name=scan.nextLine();
        System.out.println("Please enter your age");
        int age = scan.nextInt();
        System.out.println("Please enter your salary");
        double salary = scan.nextDouble();
        System.out.println("Please enter your name");

        System.out.println("Your name is "+name+" age "+age+" salary "+salary);


    }
}
