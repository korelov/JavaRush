package com.javarush.task.pro.task04.task0405;

/* 
Незаполненный прямоугольник
*/

public class Solution {
    public static void main(String[] args) {
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < 20) {
            System.out.print("Б");
            if (i == 19) {
                System.out.println();
            }
            i++;
            if (i == 20) {
                while (j < 8) {
                    System.out.println("Б                  Б");
                    if (j == 7) {
                        while (k < 20) {
                            System.out.print("Б");
                            k++;
                        }
                    }
                    j++;
                }
            }
        }
    }
}