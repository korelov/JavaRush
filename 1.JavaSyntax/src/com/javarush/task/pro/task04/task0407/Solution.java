package com.javarush.task.pro.task04.task0407;

/* 
Сумма чисел, не кратных 3
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        int i = 1;
        int sum = 0;
        while (i <= 100) {
            if (i % 3 == 0) {
                i++;
            } else {
                sum += i;
                i++;
                continue;
            }
        }
        System.out.println(sum);
    }
}