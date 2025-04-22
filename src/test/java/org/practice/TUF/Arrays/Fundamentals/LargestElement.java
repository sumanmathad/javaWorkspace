package org.practice.TUF.Arrays.Fundamentals;

public class LargestElement {
    public static void main(String[] args) {
        System.out.println(largestElement(new int[]{1,0,2,77,3,1}));
    }
    public static int largestElement(int[] nums) {
        int large=nums[0], n=nums.length;


        for(int i=1;i < n;i++){
            if(nums[i] > large){
                large=nums[i];
            }
        }
        return large;

    }
}
