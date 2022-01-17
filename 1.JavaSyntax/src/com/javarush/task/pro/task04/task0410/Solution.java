package com.javarush.task.pro.task04.task0410;

import java.util.Scanner;

/* 
Второе минимальное число из введенных
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int min;

        if (number1 <= number2) {
            min = number1;
        } else {
            min = number2;
        }
        int min2 =Integer.MAX_VALUE;
        int number;
        while (scanner.hasNextInt()) {
            number = scanner.nextInt();
            if (number < min) {
                min2 = min;
                min = number;
            } else if (number < min2 && number != min) {
                min2 = number;
            }
        }
        System.out.println(min2);
    }
}