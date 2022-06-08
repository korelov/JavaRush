package com.javarush.task.pro.task10.task1012;

import java.util.Arrays;

/* 
Дефрагментация памяти
*/

public class Memory {

    public static void main(String[] args) {
        String[] memory = {"object15", null, null, "object2", null, null, null, "object32", null, "object4"};
        executeDefragmentation(memory);
        System.out.println(Arrays.toString(memory));
    }

    public static void executeDefragmentation(String[] array) {
        String[] temp = new String[array.length];
        for (int i = 0, j = 0; i < array.length; i++) {
            if (array[i] != null) {
                temp[j++] = array[i];
            }
        }
        System.arraycopy(temp, 0, array, 0, temp.length);
    }
}
