package org.example.class7;

public class Task1 {
    public static void main(String[] args) {

        String[] cars = {"BMW","Benz","Toyota","Honda","Tesla","Volvo"};
         /*for(int i=0;i<6;i++){
             System.out.println(cars[i]);
         } */
        System.out.println(cars.length); //count number of boxes in the arrays
         int i=0;
         while(i<6){
             System.out.println(cars[i]);
             i++;
         }
    }
}
