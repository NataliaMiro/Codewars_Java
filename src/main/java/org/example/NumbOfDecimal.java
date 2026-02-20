package org.example;

public class NumbOfDecimal {
    /*
    Number of Decimal Digits
    Determine the total number of digits in the integer (n>=0)
    given as input to the function. For example,
     9 is a single digit, 66 has 2 digits and 128685 has 6 digits.
     Be careful to avoid overflows/underflows.

All inputs will be valid.

     */
    public static int numberOfDecimal(long n) {
        return String.valueOf(n).length();
    }

    static void main() {
        System.out.println(numberOfDecimal(789789464614198L));
    }
}
