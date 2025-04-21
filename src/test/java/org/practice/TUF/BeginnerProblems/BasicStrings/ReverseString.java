package org.practice.TUF.BasicStrings;

import java.util.Vector;

public class ReverseString {
    public static void main(String[] args) {
        Vector<Character> s = new Vector<>();
        s.add('S');
        s.add('U');
        s.add('M');
        s.add('A');
        s.add('N');

        System.out.println(reverseString(s));

    }
    public static Vector<Character> reverseString(Vector<Character> s) {
        for (int i=0, j=s.size()-1; i<j;i++,j--){
            Character temp= s.get(i);
            s.set(i,s.get(j));
            s.set(j,temp);
        }
        return s;
    }

}
