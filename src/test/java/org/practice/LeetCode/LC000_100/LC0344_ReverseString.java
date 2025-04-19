package org.practice.LeetCode.LC000_100;

public class LC0344_ReverseString {
    public static void main(String[] args) {
    char[] s = {'h','e','l','l','o'};
    reverseString(s);
    }
    public static void reverseString(char[] s) {
        int a =0;
        int b=s.length-1;
        while(a<b){
            char temp= s[a];
            s[a]=s[b];
            s[b]=temp;
            a++;
            b--;
        }
        System.out.println(s);
    }

}


