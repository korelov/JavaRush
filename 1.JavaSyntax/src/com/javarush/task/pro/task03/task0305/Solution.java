package com.javarush.task.pro.task03.task0305;

import java.util.Scanner;

/* 
Три числа
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a == b && b == c && c == a) {
            System.out.println(a + " " + b + " " + c);
        } else if (a == b && b != c && c != a) {
            System.out.println(a + " " + b);
        } else if (a != b && b == c && c != a) {
            System.out.println(b + " " + c);
        } else if (a == c && c != b && b != a) {
            System.out.println(a + " " + c);
        }

    }
}
