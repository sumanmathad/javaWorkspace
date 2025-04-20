package org.practice.TUF.BasicArrays;

public class CountOddNumbers {
    public static void main(String[] args) {
        System.out.println(countOdd(new int[] {1,2,4,5,7,8}, 6));
    }
    public static int countOdd(int[] arr, int n) {
        int oddCount =0;
        int i =0;
        while(i<n){
            if(arr[i]%2!=0)
                oddCount++;
            i++;
        }
        return oddCount;

    }
}
