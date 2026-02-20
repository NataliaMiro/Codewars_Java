package org.example;

/*
Quarter of the year
Given a month as an integer from 1 to 12, return to which quarter of the year it belongs as an integer number.

For example: month 2 (February), is part of the first quarter; month 6 (June), is part of the second quarter; and month 11 (November), is part of the fourth quarter.

Constraint:
 */

public class WhichMonth {
    public static int quarterOf(int month) {
//        String[] arrMounth = {"January", "February", "March", "April ",
//                "May", "June", "July", "August", "September", "October",
//                "November", "December"
//        };
        if (1 <= month && month <= 3) {
            return 1;
        } else if (3 < month && month <= 6) {
            return 2;
        } else if (7 <= month && month <= 9) {
            return 3;
        } else {
            return 4;
        }

    }

    static void main() {
        System.out.println(quarterOf(5));
    }
}
