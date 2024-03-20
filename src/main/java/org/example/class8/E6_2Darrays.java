package org.example.class8;

public class E6_2Darrays {
    public static void main(String[] args) {

     /* create 2D arrays
     10 20 40 50
     22 40 90 65
     15 50 33 30
     */
        int [][] matrix= {
                {10, 20, 40, 50},
                {22, 40, 90, 65},
                {15, 50, 33, 30}
        };

        //Add all element in the arrays and print sum
        int sum = 0;
        for (int i=0;i<3;i++){
            for (int j=0;j<4;j++){
                 sum = sum+matrix[i][j];
            }
        }
        System.out.println(sum);
    }
}
