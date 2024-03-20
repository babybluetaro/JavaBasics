package org.example.class5;

import java.util.Scanner;

public class E2Scanner {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter byte number");
        byte smallBox = input.nextByte();
        System.out.println("Please enter a double number");
        double bigBox = input.nextDouble();
        System.out.println("Please enter a boolean value");
        boolean logicalBox = input.nextBoolean();

        System.out.println(smallBox);
        System.out.println(bigBox);
        System.out.println(logicalBox);

    }
}
