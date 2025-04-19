package org.javaWorkspace.Strings;

public class ReverseString {
    public static void main(String[] args) {
        String name = "Suman Mathad";
        System.out.println(reverseOnebyOne(name));

    }

    public static String reverseOnebyOne(String name) {
        String rev = "";
        for (int i = name.length() - 1; i >= 0; i--) {
            rev = rev + name.charAt(i);
        }
        return rev;

    }


}
