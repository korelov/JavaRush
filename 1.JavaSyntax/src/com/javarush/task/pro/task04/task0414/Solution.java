package com.javarush.task.pro.task04.task0414;

import java.util.Scanner;

/* 
Хорошего не бывает много
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        int number = scanner.nextInt();

        do {
            if (number <= 0 || number >= 5) {
                System.out.println(line);
                number = 0;
            } else {
                System.out.println(line);
                number--;
            }
        } while (number > 0);
    }
}
