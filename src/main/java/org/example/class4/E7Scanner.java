package org.example.class4;

import java.util.Scanner;

public class E7Scanner {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in); //creating the object
        System.out.println("Please Enter the price of apples");
        double price = scan.nextDouble(); // we are calling nextInt method to take in put from keyboard
        System.out.println("Price of apples $"+price);


    }
}
