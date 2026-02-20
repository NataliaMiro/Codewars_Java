package org.example;

public class NumToStr {
    /*
    Нам нужна функция, которая может преобразовать число (целое число)
     в строку. Какие пути достижения этого вы знаете?
     */
    public static String numberToString(int num){
        return String.valueOf(num);
    }

    static void main() {
        System.out.println(numberToString(100));
    }
}
