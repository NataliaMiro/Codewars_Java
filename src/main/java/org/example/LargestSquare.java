package org.example;
/*
Largest Square Inside A Circle
Determine the area of the largest square that can fit inside a circle with radius r.
 */
public class LargestSquare {
    public static int areaLargestSquare(int r){
        return (r * r) * 2;
    }

    static void main() {
        System.out.println(areaLargestSquare(20));
    }
}
