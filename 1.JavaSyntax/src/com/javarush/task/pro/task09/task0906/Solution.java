package com.javarush.task.pro.task09.task0906;

import java.util.regex.Pattern;

/* 
Двоичный конвертер
*/

public class Solution {
    public static void main(String[] args) {
        int decimalNumber = Integer.MAX_VALUE;
        System.out.println("Десятичное число " + decimalNumber + " равно двоичному числу " + toBinary(decimalNumber));
        String binaryNumber = "1111111111111111111111111111111";
        System.out.println("Двоичное число " + binaryNumber + " равно десятичному числу " + toDecimal(binaryNumber));
    }

    public static String toBinary(int decimalNumber) {
        if (decimalNumber <= 0) {
            return "";
        }
        String res = "";
        while (decimalNumber != 0) {
            res = decimalNumber % 2 + res;
            decimalNumber = decimalNumber / 2;
        }
        return res;
    }

    public static int toDecimal(String binaryNumber) {
        int decimalNumber = 0;
        if (binaryNumber == null || binaryNumber.length() == 0) {
            return decimalNumber;
        }
        int res = 0;
        for (int i = 0; i < binaryNumber.length(); i++) {
            res = res + (binaryNumber.charAt(binaryNumber.length() - 1 - i) - 48) * (int) Math.pow(2, i);
        }
        return res;
    }
}
