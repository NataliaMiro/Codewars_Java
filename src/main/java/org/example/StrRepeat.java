package org.example;

public class StrRepeat {
    /*
    String repeat
Write a function that accepts a non-negative integer n and a string s as parameters,
and returns a string of s repeated exactly n times.
     */
    public static String repeatr(String string, int repeat){

//        return s.repeat(n);
        String s = "";
        for (int i = 0; i < repeat; i++) s += string;
        return s;
    }

    static void main() {
        System.out.println(repeatr("Hello", 10));
    }

}
