package org.example.class4;

public class T2NestedIf {
    public static void main(String[] args) {
        double rate = 4.5;
        int price=110000;

        if (rate<=4.5){
            System.out.println("You should buy a house");
            if (price>100000){
                System.out.println("You will take a loan");
            }else{
                System.out.println("You will pay cash");
            }
        }else{
            System.out.println("You should not buy a house");
        }
    }
}
