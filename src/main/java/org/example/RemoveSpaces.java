package org.example;

/*
Remove String Spaces

Write a function that removes
 the spaces from the string, then return the resultant string.
 */
public class RemoveSpaces {
    public static String deletedSpase(String text){
        return text.replaceAll(" ", "");
    }

    static void main() {
        System.out.println(deletedSpase("8 8 Bi fk8h B 8 BB8B B B  B888 c hl8 BhB fd"));
    }
}
