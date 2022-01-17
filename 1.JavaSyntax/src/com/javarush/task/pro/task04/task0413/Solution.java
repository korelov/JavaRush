package com.javarush.task.pro.task04.task0413;

/* 
Рисуем треугольник
*/

public class Solution {
    public static void main(String[] args) {
        String rez = "8";
        for (int j = 1; j <= 10; j++) {
            System.out.println(rez);
            rez += "8";
        }
    }
}