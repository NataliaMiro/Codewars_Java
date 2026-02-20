package org.example;

public class StrToNum {
    public static int stringToNumber(String str){
        return Integer.parseInt(str);
    }

    static void main() {
        System.out.println(stringToNumber("7474"));
    }
}
