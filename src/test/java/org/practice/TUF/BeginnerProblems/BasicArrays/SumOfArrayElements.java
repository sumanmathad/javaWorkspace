package org.practice.TUF.BasicArrays;

public class SumOfArrayElements {

    public static void main(String[] args) {
        System.out.println(sum(new int[] {1,2,3,4,5}, 5));
    }
    public static int sum(int arr[], int n) {
        int total=arr[0], i=1;
        while(i<n){
            total+=arr[i];
            i++;
        }
        return total;

    }

}
