package org.example.class7;

public class Task3 {
    public static void main(String[] args) {

        int[] nums={10,20,30,40,50};
        int sum =0;
        for(int n:nums){
            sum = sum + n;
        }
        System.out.println(sum);

        /*for(int i=0;i<5;i++){
            sum +=nums[i];
        }
        System.out.println(sum);*/
    }
}
