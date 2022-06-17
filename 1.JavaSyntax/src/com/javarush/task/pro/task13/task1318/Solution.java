package com.javarush.task.pro.task13.task1318;

/* 
Следующий месяц, пожалуйста
*/

public class Solution {

    public static void main(String[] args) {
        System.out.println(getNextMonth(Month.JANUARY));
        System.out.println(getNextMonth(Month.JULY));
        System.out.println(getNextMonth(Month.DECEMBER));

    }

    public static Month getNextMonth(Month month) {
        Month[] months = Month.values();
        Month nextMonth = null;
        if (month.ordinal() == 11) {
            nextMonth = Month.JANUARY;
        }
        for (int i = 0; i < months.length - 1; i++) {
            if (months[i] == month) {
                nextMonth = months[i + 1];
            }
        }
        return nextMonth;
    }
}
