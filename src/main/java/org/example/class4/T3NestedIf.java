package org.example.class4;

public class T3NestedIf {
    public static void main(String[] args) {
        int age = 18;
        int weight = 110;

        if(age>=18){
            if (weight>110){
                System.out.println("You are eligible to donate your blood");
            }else{
                System.out.println("You are not eligible to donate your blood");
            }
        }else{
            System.out.println("You are not eligible to donate your blood");
        }
    }
}
