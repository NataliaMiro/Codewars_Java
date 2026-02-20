package org.example;

public class ToBinary {
    /*
    Convert to Binary
    Task Overview

Given a non-negative integer b, write a function which
returns an integer d such that the binary
representation of b is the same as the decimal representation of d.
     */
    public static int toBinary(int n){
        return Integer.parseInt(Integer.toBinaryString(n));
    }

    static void main() {
        System.out.println(toBinary(465));
    }
}
