package com.javarush.task.pro.task04.task0409;

import java.util.Scanner;

/* 
Минимум из введенных чисел
*/

public class Solution {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int max = Integer.MAX_VALUE;
        while (console.hasNextInt())
        {
            int x = console.nextInt();
            if (x < max)
                max = x;
        }
        System.out.println(max);

    }
}