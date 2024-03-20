package org.example.class5;

import java.util.Scanner;

public class E3Scanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your first name");
        String firstName = input.next();
        //.next() only store 1 word at a time
        System.out.println(firstName);
    }
}
