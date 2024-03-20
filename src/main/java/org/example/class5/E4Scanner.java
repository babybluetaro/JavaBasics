package org.example.class5;

import java.util.Scanner;

public class E4Scanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your name");
        String name = input.nextLine();
        //.nextLine() can store entire sentences
        System.out.println(name);
    }
}
