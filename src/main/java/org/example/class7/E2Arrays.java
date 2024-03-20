package org.example.class7;

import java.util.Arrays;

public class E2Arrays {
    public static void main(String[] args) {

        String [] names = new String[50]; //computer create 50 boxes(0-49) of variable names
        names[4] = "Lora"; //store Lora inside the box no.4(5th box)
        names[10] = "James";

        //used to see the values inside the array
        System.out.println(Arrays.toString(names));
    }
}
