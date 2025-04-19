package org.practice.TUF.BasicStrings;

public class PalindromeCheck {

    public static void main(String[] args) {
        String s = "habbah";
        System.out.println(palindromeCheck(s));
    }

    public static boolean palindromeCheck(String s) {

        for(int i=0, j=s.length()-1; i<j;i++,j--){
            if(!(s.charAt(i)==s.charAt(j)))
                return false;
        }
        return true;
    }


}
