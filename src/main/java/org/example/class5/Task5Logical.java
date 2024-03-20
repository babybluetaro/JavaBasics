package org.example.class5;

import java.util.Scanner;

public class Task5Logical {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter birth month");
        String month = input.nextLine().toLowerCase();

        switch(month){
            case("March"):
            case("Aprril"):
            case("May"):
                System.out.println("Spring");
                break;
            case("June"):
            case("July"):
            case("August"):
                System.out.println("Summer");
                break;
            case("September"):
            case("October"):
            case("November"):
                System.out.println("Fall");
                break;
            case("December"):
            case("January"):
            case("Febuary"):
                System.out.println("Winter");
                break;
            default:
                System.out.println("Invalid");
        }

    }
}
