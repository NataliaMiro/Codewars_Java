package org.example;
/* yu
Opposite number
Very simple, given a number, find its opposite (additive inverse).
 */
public class OppositeNumber {
    public static int toOpposite(int num){
        return (-1) * num;
    }

    static void main() {
        System.out.println(toOpposite(-123));
    }
}
