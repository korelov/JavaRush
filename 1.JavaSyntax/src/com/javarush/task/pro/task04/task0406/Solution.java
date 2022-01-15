package com.javarush.task.pro.task04.task0406;

import java.util.Scanner;

/* 
Показываем, что получаем
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String enter = "";
        boolean exit = true;
        while (exit) {
            enter = scanner.nextLine();
            if (!enter.equals("enough")) {
                System.out.println(enter);
            } else {
                break;
            }
        }
    }
}