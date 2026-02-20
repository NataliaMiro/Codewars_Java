package org.example;
/*
Remove String Spaces
Write a function that removes the spaces from the string,
then return the resultant string.
 */
public class RemoveSpases {
    public static String removingSpases(String text){

            return text.replaceAll(" ", "");

    }

    static void main() {
        System.out.println(removingSpases("cvcv chcb cncn cncn"));
    }
}
