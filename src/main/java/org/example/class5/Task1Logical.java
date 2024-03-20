package org.example.class5;

import java.util.Scanner;

public class Task1Logical {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Pleaase enter your height in inches");
        int height = input.nextInt();

        if (height<60){
            System.out.println("short");
        } else if(height>=60 && height<=72) {
            System.out.println("Medium");
        }else {
            System.out.println("Tall");
        }
    }
}
