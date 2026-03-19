package org.example;
/*
Square Every Digit
Welcome. In this kata, you are asked to square every digit of a number and concatenate them.

For example, if we run 9119 through the function, 811181 will come out, because 92 is 81 and 12 is 1. (81-1-1-81)

Example #2: An input of 765 will/should return 493625 because 72 is 49, 62 is 36, and 52 is 25. (49-36-25)

Note: The function accepts an integer and returns an integer.

Happy Coding!
 */
public class SquareDigit {

    public int squareDigit(int n) {// Преобразуем число в строку для удобной работы с каждой цифрой
        String numberStr = String.valueOf(n);

        // Создаем StringBuilder для эффективной конкатенации
        StringBuilder result = new StringBuilder();

        // Проходим по каждому символу (цифре) в строке
        for (int i = 0; i < numberStr.length(); i++) {
            // Получаем текущий символ и преобразуем его в число
            char digitChar = numberStr.charAt(i);
            int digit = Character.getNumericValue(digitChar);

            // Возводим цифру в квадрат
            int squaredDigit = digit * digit;

            // Добавляем результат к строке результата
            result.append(squaredDigit);
        }

        // Преобразуем строку обратно в число и возвращаем
        return Integer.parseInt(result.toString());
    }

    static void main() {
        SquareDigit sd = new SquareDigit();

        // Тест 1: 9119 -> 811181
        System.out.println(sd.squareDigit(9119)); // Должно вывести 811181

        // Тест 2: 765 -> 493625
        System.out.println(sd.squareDigit(765)); // Должно вывести 493625

    }

}
