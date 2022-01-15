package com.javarush.task.pro.task04.task0403;

import java.util.Scanner;

/* 
Суммирование
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String enter = "";
        boolean exit = true;
        int sum = 0;
        while (exit) {
            enter = scanner.nextLine();
            if (!enter.equals("ENTER")) {
                sum += Integer.parseInt(enter);
            } else {
                exit = false;
            }
        }
        System.out.println(sum);
    }
}