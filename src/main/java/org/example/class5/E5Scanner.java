package org.example.class5;

import java.util.Scanner;

public class E5Scanner {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your gender");
        char gender = input.next().charAt(0);
        /*
        next()==store only first word
        char.At(0)==store only first letter of first word from next()
        char.At(1)==store only second letter

         */

        System.out.println(gender);
    }
}
