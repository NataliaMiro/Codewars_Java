package org.example;

public class CountingSheep {
    /*
    Если вы не можете спать, просто посчитайте овцу!!
    Учитывая неотрицательное целое число, 3к примеру,
    вернуть веревку с ропотом: "1 sheep...2 sheep...3 sheep...".
     Вход всегда будет действительным,
    т.е. отсутствие отрицательных целых чисел.
     */

    public static String countingSheep(int num){
        String result = "";

        for (int i = 1; i < num ; i++){
            result += i + " sheep...";
        }
        return result;
    }

    static void main() {
        System.out.println(countingSheep(4));
    }
}
