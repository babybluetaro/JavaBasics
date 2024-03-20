package org.example.class5;

import java.util.Scanner;

public class E7Scanner {
    public static void main(String[] args) {
        Scanner input1 = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);

        //use separate scanner to avoid the nextline matter

        System.out.println("Please enter your age");
        int age = input1.nextInt();
        System.out.println("Please enter your full name");
        String fullName = input2.nextLine();
        System.out.println("Your Full name and age is "+fullName+" "+age);
    }
}
