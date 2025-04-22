package org.practice.TUF.Arrays.Fundamentals;

public class LinearSearch {
    public static void main(String[] args) {
        System.out.println(linearSearch(new int[] {1,2,3,4,5},0));

    }
    public static int linearSearch(int nums[], int target) {
        int n=nums.length;
        for(int i=0;i<n;i++){
            if (nums[i]==target)
                return i;
        }
        return -1;
    }
}
