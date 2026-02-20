package org.example;

public class OppositesAttract {
    /*
    Тимми и Сара думают, что они влюблены,
    но вокруг того, где они живут, они узнают только тогда,
    когда выберут цветок каждый.
    Если один из цветов имеет четное количество лепестков,
    а другой имеет нечетное количество лепестков,
    это означает, что они влюблены.

Напишите функцию, которая возьмет количество лепестков каждого цветка
и вернется истинным, если они влюблены и ложны, если они не влюблены.

     */
    public static boolean isLove(final int flower1, final int flower2) {
        if (((flower1 % 2 == 0) && (flower2 % 2 != 0)) || (((flower2 % 2 == 0) && (flower1 % 2 != 0)))) {
            return true;
        }
        return false;


    }

    static void main() {
        System.out.println(isLove(6, 2));
    }
}







