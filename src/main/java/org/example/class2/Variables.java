package org.example.class2;

public class Variables {
    public static void main(String[] args) {
        String firstName="Nathan";
        String lastName="Poch";
        String city="Las Vegas";
        String state="Nevada";
        String phone="929-498-2687";
        System.out.println("My First name is "+firstName+" and my last name is "+lastName );
        System.out.println("I live in city "+city+" and state "+state );
        System.out.println("My phone number is "+phone);

        city="Elmhurst"; //change value
        state="New York";
        phone="682-889-4658";
        System.out.println("My name is "+firstName+" "+lastName+" and I move to new city "+city+" and new state "+state+".");
        System.out.println("And my phone number is "+phone );

    }
}
