package org.example;
/*
Remove First and Last Character
Your goal is to write a function that removes the first
and last characters of a string.
You're given one parameter, the original string.

Important: Your function should handle strings
of any length ≥ 2 characters.
For strings with exactly 2 characters, return an empty string.
 */
public class RemoveFirstAndLastChar {
    public static String remove( String text){
        return text.substring(1, text.length()-1);
    }

    static void main() {
        System.out.println(remove("jfffppdd"));
    }
}
