package org.example.class5;

import java.util.Scanner;

public class Task3Scanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your city : ");
        String city = input.nextLine();
        System.out.println("Please enter the temperature in your city");
        double tempF = input.nextDouble();
        double tempC = (tempF-32)*5.0/9.0;

        System.out.println("The temperature in the city "+city+" is "+tempC+"C");


    }
}
