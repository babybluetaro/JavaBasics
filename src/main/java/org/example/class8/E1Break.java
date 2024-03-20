package org.example.class8;

import java.util.Scanner;

public class E1Break {
    public static void main(String[] args) {

        String[] names={"James","Bubble","Bieber","Nathan","Ellie"};
        //search the name in arrays if it's present print name is present

        Scanner input = new Scanner(System.in);
        System.out.println("Search");
        String search = input.nextLine();
        for (String n:names){

            if (search.equals(n)){
                System.out.println(n+" is present");
                break;  //break will terminate the loop if name matched
                //to avoid unnecessary search other elements
            }
        }
    }
}
