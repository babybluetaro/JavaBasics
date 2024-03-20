package org.example.class5;

import java.util.Scanner;

public class Task4Scanner {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
        System.out.println("Do you have credit card?(true or false)");
        boolean card = input.nextBoolean();
        /*String card = input.next()  if enter yes or no
        if(card.equalsIgnoreCase(anotherString"Yes"))
         */
        if (card){
            System.out.println("What is balance on the card?");
            double balance = input.nextDouble();
            if(balance>1000){
                System.out.println("Pay off immediately!");
            }else{
                System.out.println("You can spend more!");
            }
        }else {
            System.out.println("We can offer you the credit card!");
        }

    }
}
