package org.example;

public class SimpleMultiplication {
    /*
    Simple multiplication
    This kata is about multiplying
    a given number by eight if it is an even number and by nine otherwise.
     */
    public static int simpleMultiplication(int n){
        if (n % 2 == 0){
            return n * 8;
        } else {
            return n * 9;
        }

    }

    static void main() {
        System.out.println(simpleMultiplication(3));
    }
}
