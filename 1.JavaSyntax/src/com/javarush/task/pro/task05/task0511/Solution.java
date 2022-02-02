package com.javarush.task.pro.task05.task0511;

import java.util.Scanner;

/* 
Создаем двумерный массив
*/

public class Solution {
    public static int[][] multiArray;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        multiArray = new int[row][];
        while (scanner.hasNextInt()) {
            for (int i = 0; i < multiArray.length; i++) {
                multiArray[i] = new int[scanner.nextInt()];
            }
        }
    }
}
