package org.example;

public class WhichOfCentury {
    /*
    Introduction

The first century spans from the year 1 up to and including the year 100, the second century - from the year 101 up to and including the year 200, etc.
Task

Given a year, return the century it is in.
     */
    public static int centurry(int number){
        return ((number + 99)/ 100);
    }

    static void main() {
        System.out.println(centurry(1));
    }
}
