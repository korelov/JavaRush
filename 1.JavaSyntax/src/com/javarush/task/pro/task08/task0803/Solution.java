package com.javarush.task.pro.task08.task0803;

import java.util.Arrays;
import java.util.Scanner;

/* 
Минимальный элемент массива
*/

public class Solution {

    public static void main(String[] args) {
        int[] intArray = getArrayOfTenElements();
        System.out.println(min(intArray));
    }

    public static int min(int[] ints) {
        Arrays.sort(ints);
        return Math.min(ints[0], Integer.MAX_VALUE);
    }

    public static int[] getArrayOfTenElements() {
        Scanner scanner = new Scanner(System.in);
        int[] temp = new int[10];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = scanner.nextInt();
        }
        return temp;
    }
}
