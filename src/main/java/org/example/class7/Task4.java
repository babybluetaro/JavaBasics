package org.example.class7;

public class Task4 {
    public static void main(String[] args) {
//Find the largest number from arrays
        int[] nums={10,20,90,40,50,120,567,76};
        int largest = nums[0];
        for(int n:nums){
            if (n>largest){
                largest = n;
            }
        }
        System.out.println(largest);
    }
}
