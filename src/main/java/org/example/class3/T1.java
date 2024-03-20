package org.example.class3;

public class T1 {
    public static void main(String[] args) {
        double num1 = 22.57;
        double num2 = 7.79;
        double add= num1+num2;
        double sub = num1-num2;
        double mul = num1*num2;
        double divide = num1/num2;
        System.out.println("The addition of 2 numbers "+num1+" and "+num2+" is equal to "+add);
         // or
        System.out.println("The addition of 2 numbers "+num1+" and "+num2+" is equal to "+(num1+num2));
        System.out.println("The subtraction of 2 numbers "+num1+" and "+num2+" is equal to "+sub);
        System.out.println("The multiplication of 2 numbers "+num1+" and "+num2+" is equal to "+mul);
        System.out.println("The division of 2 numbers "+num1+" and "+num2+" is equal to "+divide);
    }
}

