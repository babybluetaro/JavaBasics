package org.example.class4;

public class T4NestedIf {
    public static void main(String[] args) {
        int num1 = 6;
        int num2 = 20;
        int num3 = 7;

        if (num1 > num2) {
            if (num1 > num3) {
                System.out.println(num1 + " is the largest number");

            }System.out.println(num3 + " is the largest number");

        } else if (num2 > num3) {
            System.out.println(num2 + " is the largest number");
        } else {
            System.out.println(num3 + " is the largest number");
        }

    }
}
