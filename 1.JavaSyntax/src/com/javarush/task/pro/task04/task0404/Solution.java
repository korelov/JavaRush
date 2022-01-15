package com.javarush.task.pro.task04.task0404;

/* 
Заполненный прямоугольник
*/

public class Solution {
    public static void main(String[] args) {

        int a = 0;
        while (a < 5) {
            if (a > 0) {
                System.out.println();
            }
            int b = 0;
            while (b < 10) {
                System.out.print("Q");
                b++;
            }
            a++;
        }
    }
}