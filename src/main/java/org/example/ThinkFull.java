package org.example;

public class ThinkFull {
    public static String updateLight(String current) {
        String updateLight = "";
        if (current.equals("green")) {
            return updateLight = "yellow";
        } else if (current.equals("yellow")) {
            return updateLight = "red";
        } else if (current.equals("red")) {
            return updateLight = "green";
        }
        


        return updateLight;
    }

    static void main() {
        System.out.println(updateLight("yellow"));
    }
}
