package org.example.class5;

import java.util.Scanner;

public class E6Scanner {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.println("Please enter your age");
        int age = input.nextInt();
        System.out.println("Please enter your full name");
        // extra call to nextLine to clear the buffer memory
        //if not when we type age+Enter from keyboard computer gonna store number in age
        // and store "Enter" in full name in buffer mempry
        input.nextLine();// to clear the buffer memory
        String fullName = input.nextLine();
        System.out.println("You name is "+fullName+" you are "+age+" years old");
    }
}
