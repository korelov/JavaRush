package com.javarush.task.pro.task12.task1210;

import java.util.ArrayList;
import java.util.Arrays;

/* 
Переворачивание данных
*/

public class Solution {
    public static ArrayList<Integer> numbers = new ArrayList<>();

    public static void main(String[] args) {
        init();
        print();

        reverse();
        print();
    }

    public static void init() {
        for (int i = 0; i < 10; i++) {
            numbers.add(i);
        }
    }

    public static void reverse() {
        ArrayList<Integer> temp = new ArrayList<>();
        for (int i = 0; i < numbers.size(); i++) {
            temp.add(i,numbers.get(numbers.size()-1-i));
        }
        for (int i = 0; i < temp.size(); i++) {
            numbers.set(i,temp.get(i));
        }
    }

    private static void print() {
        for (Integer number : numbers) {
            System.out.println(number);
        }
    }
}
