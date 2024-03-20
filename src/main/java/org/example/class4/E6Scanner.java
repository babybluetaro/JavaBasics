package org.example.class4;

import java.util.Scanner;

public class E6Scanner {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in); //creating the object
        System.out.println("Please Enter your age");
        int age = scan.nextInt(); // we are calling nextInt method to take in put from keyboard
        System.out.println("You are "+age+" years old");


    }
}
