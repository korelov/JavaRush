package com.javarush.task.pro.task05.task0508;

import java.util.Arrays;
import java.util.Scanner;

/* 
Удаляем одинаковые строки
*/

public class Solution {
    public static String[] strings;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        strings = new String[6];
        for (int i = 0; i < 6; i++) {
            strings[i] = scanner.nextLine();
        }
      String[] strings1 = Arrays.copyOf(strings, strings.length);
        int count = 0;
        for (int i = 0; i < strings.length; i++) {
            for (int j = 0; j < strings1.length; j++) {
                if (strings[i].equals(strings1[j])) {
                    count++;
                }
            }
            if (count >= 2) {
                strings[i] = null;
            }
            count = 0;
        }

        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i] + ", ");
        }
    }
}
