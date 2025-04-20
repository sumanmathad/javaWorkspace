package org.practice.TUF.BasicArrays;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(reverse(new int[] {1,3,1,2}, 4)));
    }

    public static int[] reverse(int[] arr, int n) {
        int i=0, j=n-1;
        while(i<j){
            int temp = arr[i];
            arr[i]= arr[j];
            arr[j]=temp;
            j--;
            i++;
        }
        return arr;
    }
}
