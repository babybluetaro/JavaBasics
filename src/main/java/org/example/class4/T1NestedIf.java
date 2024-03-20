package org.example.class4;

public class T1NestedIf {
    public static void main(String[] args) {
        boolean degree = true;
        double gpa=2.5;
        if (degree){
            System.out.println("Congratulations");
            if (gpa>=3.5){
                System.out.println("You are eligible for scholarship");
            }else{
                System.out.println("You should have study harder");
            }
        }else{
            System.out.println("You should get a degree");
        }
    }
}
