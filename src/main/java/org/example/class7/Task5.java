package org.example.class7;

public class Task5 {
    public static void main(String[] args) {
//Print reverse order of char in arrays
        char[] letter = {'A','B','C','D','Z'};

        for(int i= letter.length;i>=1;i--){
            System.out.println(letter[i-1]);
        }
         // OR
        for(int i= letter.length-1;i>=0;i--){
            System.out.println(letter[i]);
        }
    }
}
