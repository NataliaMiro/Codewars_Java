package org.example;

public class SmallestIntegerFinder {
    public static int foundSmallestInt(int[] args){
        int smallestNum = Integer.MAX_VALUE;
        for (int i = 0; i < args.length; i++){
            if(args[i] < smallestNum){
                smallestNum = args[i];
            }

        }
        return smallestNum;
    }

    static void main() {
        int[] numbers = {1, 2, -89};
        System.out.println(foundSmallestInt(numbers));
    }

}
